
public class TryCatch {
    public static void main(String[] args) {
        try {
            int num1 = 1111;
            int num2 = 0;
            int result = num1 / num2; 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } 
    }
}

