/* The class for Apple Model 
 * @author Drew Francis Tomasovic
 * @see Object
 * This is a model of an Apple
*/
public class AppleModel {
/*This is a state attribute/field/property*/

    private String color;
    private String type;
    private int weight;
    private boolean ripe;
    private int juice = 10;
    private boolean rotten = false;


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
/*
juices the apple until out of juice
 * Decrement juice by 1 if juice > 0
 * @return juice left in Apple
 * @return remaining juice
 */
    public int juiceApple(){
        if(this.juice > 0){
            this.juice--;
        }
        return this.juice;
    }
    }
    /*This is an assignment variable,use THIS to define a parameter within a method, it references the weight class  */
    /* Goal is to make code highly readable */
    /* String is an object in java, int and bool are primitive data types in java*/


