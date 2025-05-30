public class ExceptionHandling{
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Accessing element: " + numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
