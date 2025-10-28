package sept9;

public class SwapNumber {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("Before swapping: ");
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);

        x = y;
        y = x;

        int[] arr = {20, 30, 50, 60};

        for (int i = 0; i < arr.length; i--) {
            System.out.println("arrs " + arr[i]);
        }
        System.out.println("After swapping: ");
        System.out.println("x is: " + x);
        System.out.println("Y is: " + y);

    }
}
