public class JavaVariableBindingEvolution {
    
    // Example of variable binding evolution in Java
    public static void main(String[] args) {
        System.out.println("=== Java Variable Binding Evolution ===\n");
        
        // Java 1.0 - Basic variable declaration (must be declared before use)
        int x = 10; 
        System.out.println("1. Basic variable declaration:");
        System.out.println("   x = " + x);
        
        // This would cause compile error: y not declared
        // y = 20; // Uncomment to see error: cannot find symbol
        
        // Java 1.0 - final constants
        final int CONSTANT = 100;
        System.out.println("\n2. Final constant:");
        System.out.println("   CONSTANT = " + CONSTANT);
        // CONSTANT = 200; // Uncomment to see error: cannot assign a value to final variable
        
        // Java 5 - Enhanced for loop variable binding
        System.out.println("\n3. Enhanced for loop (Java 5):");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("   num = " + num);
        }
        
        // Java 8 - Lambda parameter binding
        System.out.println("\n4. Lambda expressions (Java 8):");
        Runnable r = () -> {
            int lambdaVar = 50;
            System.out.println("   lambdaVar inside lambda = " + lambdaVar);
        };
        r.run();
        
        // Java 10 - Local variable type inference (var)
        System.out.println("\n5. Local variable type inference (Java 10):");
        var inferred = "Hello Java 10";
        System.out.println("   inferred = \"" + inferred + "\"");
        System.out.println("   Type of inferred: " + inferred.getClass().getSimpleName());
    }
}

// Inner class example showing different scope
class Example {
    public void method() {
        int x = 10; // Must be declared before use
        System.out.println("x in Example.method() = " + x);
        
        final int CONSTANT = 100; // Since Java 1.0
        System.out.println("CONSTANT in Example.method() = " + CONSTANT);
        
        // y = 20; // Uncomment to see compile error: cannot find symbol y
    }
}