package Pet;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>();

        pets.add(new Cat("alice", "black"));
        pets.add(new Cat("james", "brown"));
        pets.add(new Parrot("bob"));
        pets.add(new Canary("mike"));

        for(Pet i: pets){
            System.out.println(i.makeNoise());
            // System.out.println(i.getColor()); <--- this doesn't work

        }
    }
}
