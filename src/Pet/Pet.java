package Pet;

public interface Pet {

    // an interface is like a blueprint for a class
    // it cannot do new Pet(...)
    // Any interface cannot be instantiated
    // List<String> list = new ArrayList<>();
    // The List is an interface, such that we can not use List but using ArrayList;

    public String makeNoise(); // It guarantees that any class representing Pet should have this method

}

//          Pet
//          /\
//         /  \
//       Cat  Bird(Abstract class)
//            /  \
//           /    \
//        Parrot  Canary

// class is blueprint and object is the instance
// java also have a class called object
// public class Object
// Object is the mother class, all classes that are created in java
// All classes we create instant object
// provides default set of behaviors to al classes
// also the rule for comparing the object
// the default constructor
//  - no parameters
//  - does nothing
// - only put the space of object in memory