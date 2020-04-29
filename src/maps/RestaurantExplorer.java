package maps;


import java.util.HashMap;
import java.util.Map;

public class RestaurantExplorer {
    public static void main(String [] args) {
        // Step 1. Create a new empty HashMap.
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.

        Map<String,Restaurant> restaurants = new HashMap();

        // Step 2. Add five restaurants to the map (hint: use put()).

        Restaurant Shish = new Restaurant("Shish","Gyro",5);
        Restaurant PadThai = new Restaurant("PadThai","Curry",5);
        Restaurant MyBurger = new Restaurant("My Burger","Burger",4);
        Restaurant CafeMac = new Restaurant("Cafe Mac","Nothing Delicious",3);
        Restaurant Grill = new Restaurant("Grill","Chicken Tender",4);

        restaurants.put(Shish.getName(),Shish);
        restaurants.put(PadThai.getName(),PadThai);
        restaurants.put(MyBurger.getName(),MyBurger);
        restaurants.put(CafeMac.getName(),CafeMac);
        restaurants.put(Grill.getName(),Grill);

        // Step 3. Print the names of each restaurant (hint: use keySet()).

        for(String i : restaurants.keySet()){
            System.out.println(i);
        }

        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).

        restaurants.remove("Grill");
        System.out.println(restaurants.containsKey("Grill"));

        // Step 5. Print the restaurant objects (hint: use values())

        for(Restaurant i : restaurants.values()){
            System.out.println(i);
        }

        // Step 6. Print the restaurant names and objects (hint: use entrySet()).

        System.out.println(restaurants.entrySet());
    }
}
