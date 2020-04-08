package Pet;

public class Parrot extends Bird {
    // Parrot gains all the behaviour of Bird
    // But Bird implement from Pet
    // Therefore we also need to implement the make noise

    public Parrot(String name) {
        super(name);
    }

    @Override
    public String makeNoise(){
        return super.name + " the parrot says hello!";
    }
}
