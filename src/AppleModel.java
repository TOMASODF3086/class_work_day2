/* The class for Apple Model */
public class AppleModel {
/*This is a state atribute/field/property*/

    private String color;
    private String type;
    private int weight;
    private boolean ripe;


    public void setColor(String color){
        if(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green")){
                this.color=color;
        }
    }

    public String getColor(){
        return this.color;
    }


    public void setRipe(boolean ripe){
        this.ripe = ripe;
    }


    public boolean isRipe(){
        return this.ripe;
    }

    public int getWeight(){
            return this.weight;
    }
    /* Set the give weight 0++ to 3- cannot be outside of range */

    public void setWeight(int weight){
        if(weight>= 0 && weight <= 3){
                this.weight = weight;
        }
    }
    /*This is an assignment variable,use THIS to define a parameter within a method, it references the weight class  */
    /* Goal is to make code highly readable */
    /* String is an object, int and bool are primitive data types */
}

