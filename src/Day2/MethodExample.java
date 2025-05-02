package Day2;

public class MethodExample {
	public static int add(int x, int y) {
        return x + y;
    }

    // Method to check if number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("Addition: " + result);

        boolean check = isEven(9);
        System.out.println("Is even? " + check);
	
    }
}
