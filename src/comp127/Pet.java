package comp127;

public class Pet {
    // each object has a copy of all these variables that we specify
    private String name;
    private String color;
    private String species;

    private boolean isHungry;
    private int happiness;

    // construct method
    public Pet(String name, String color, String species){
        // variables set by the user
        this.name = name;
        this.color = color;
        this.species = species;

        // variables set with the starting values
        isHungry = false;
        happiness = 5;
    }

    // get method helps the variable become public to us
    public int getHappiness(){
        return happiness;
    }

    public void feed(){
        if(isHungry){
            isHungry = false;
            happiness++;
        }else{
            happiness--;
        }
    }

    public void play(){
        if(isHungry){
            happiness--;
        }else{
            happiness++;
            isHungry = true;
        }
    }

    // toString creates a String variable that uniquely represent your object
    @Override
    public String toString(){
        return name + " the " + color + " " + species;
    }
}
