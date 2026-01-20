public class PrototypeDemo {
    // File: PrototypeDemo.java
     public static void main(String[] args) {
        // Create base prototype (like Object.prototype)
        JSPrototype animal = new JSPrototype();
        animal.setProperty("type", "Animal");
        animal.setProperty("makeSound", (Runnable)() -> 
            System.out.println("Generic animal sound"));
        
        // Create derived prototype (like inheritance)
        JSPrototype dog = JSPrototype.create(animal);
        dog.setProperty("type", "Dog");
        dog.setProperty("makeSound", (Runnable)() -> 
            System.out.println("Woof!"));
        dog.setProperty("breed", "Golden Retriever");
        
        // Create instance
        JSPrototype myDog = dog.callAsConstructor();
        
        // Demonstrate prototype chain
        System.out.println("Direct property: " + 
            myDog.getProperty("breed"));
        System.out.println("Inherited property: " + 
            myDog.getProperty("type"));
        
        // Demonstrate method execution
        ((Runnable)myDog.getProperty("makeSound")).run();
        
        // Show hasOwnProperty behavior
        System.out.println("Has own 'breed': " + 
            myDog.hasOwnProperty("breed"));
        System.out.println("Has own 'type': " + 
            myDog.hasOwnProperty("type"));
    }
}
