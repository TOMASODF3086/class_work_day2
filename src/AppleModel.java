/* The class for Apple Model */
public class AppleModel {
/*This is a state atribute/field/property*/

    private String color;
    private String type;
    private int weight;
    private boolean ripe;

    public int getWeight(){
            return weight;
    }

    public void setWeight(int weight){
        if(weight>= 0 && weight <= 3){
                this.weight = weight;
        }
    }
    /*This is an assignment variable,use THIS to define a parameter within a method, it references the weight class  */
    /* Goal is to make code highly readable */
}

