package comp127;

public class HatMain {
    public static void main(String[] args) {
        Hat cap = new Hat("baseball cap", "grey", "wool", 7.75, 3);

        String badActor = cap.getType();
        badActor = "triby";
        System.out.println(cap.getType());
    }
}
