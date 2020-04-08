package Pet;

public class Bird implements Pet{
    // an abstract class

    public String name;
    private boolean isFlying;

    public Bird(String name){
        this.name = name;
        isFlying = false;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    public void fly(){
        if(!isFlying){
            isFlying = true;
        }
    }

    public void land(){
        if(isFlying){
            isFlying = false;
        }
    }
}
