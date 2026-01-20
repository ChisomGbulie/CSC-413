import java.util.ArrayList;

public class TypeInferenceEvolution {
    public static void main(String[] args) {
        // Java 1.0 (1996)
        String message1 = "Hello";
        ArrayList<String> list1 = new ArrayList<String>();
        
        // Java 7 (2011) - Diamond operator
        ArrayList<String> list2 = new ArrayList<>();
        
        // Java 10 (2018) - Local variable type inference
        var message2 = "Hello";
        var list3 = new ArrayList<String>();
        
        // Example usage
        System.out.println(message1);
        System.out.println(message2);
        list1.add("Java");
        list2.add("Evolution");
        list3.add("Type Inference");
    }
}