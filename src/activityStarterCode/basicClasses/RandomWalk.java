package activityStarterCode.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int currentWalk;
    private int min;
    private int max;
    /**
     * Creates a new random walk starting with some initial value.
     * TODO: Adjust this constructor to take an initial value for the walk.
     */
    public RandomWalk(int currentWalk, int min, int max) {
        rng = new Random();
        this.currentWalk = currentWalk;
        this.min = min;
        this.max = max;
    }

    /**
     * TODO Complete me.
     * @return the current value for the random walk.
     */
    public int getValue() {
        return this.currentWalk; //TODO - this is not correct.
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * TODO: Complete me.
     * @return Updated value.
     */
    public int advanceValue() {
        Random i = new Random();
        boolean n = i.nextBoolean();
        if(n){
            this.currentWalk+=1;
            return currentWalk;
        }else{
            this.currentWalk-=1;
            return currentWalk;
        }
    }
}

