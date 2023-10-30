
public class TypeCasting {
    public static void main(String[] args) {
        
        int intValue = 100;
        double doubleValue = intValue;
        System.out.println("Implicit Type Casting");
        System.out.println("int to double: " + doubleValue);

      
        
        char charValue = 'A';
        int intValueFromChar = (int) charValue;
        System.out.println("\nExplicit Type Casting (char to int):");
        System.out.println("char to int: " + intValueFromChar);
    }
}
