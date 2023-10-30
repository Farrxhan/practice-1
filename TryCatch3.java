
public class TryCatch3 {
    public static void main(String[] args) {
        try {
            
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
            System.out.println("This is Finally block");
        }
    }
}
