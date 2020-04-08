package Pet;

public class Cat implements Pet{

    private String name;
    private String color;

    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String makeNoise() {
        return "this " + color + " cat " + name + " says meow";
    }

    public String getColor() {
        return color;
    }
}
