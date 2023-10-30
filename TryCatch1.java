
public class TryCatch1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        try {
            int index = 3;
            int result = numbers[index];
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = "Array index is out of bounds: " + e.getMessage();
            handleException(message);
        }
    }

    public static void handleException(String errorMessage) {
        System.out.println("Exception caught: " + errorMessage);
    }
}

