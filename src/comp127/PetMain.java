package comp127;

public class PetMain {
    public static void main(String[] args) {
        Pet a = new Pet("harry","Black", "Gerbil");
        a.play();
        a.feed();
        a.feed();
        a.play();
        System.out.println("Pet a's happiness is " + a.getHappiness());
    }
}
