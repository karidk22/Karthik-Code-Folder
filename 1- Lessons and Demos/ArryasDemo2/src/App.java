import java.util.Scanner;
public class App {
    private static Scanner inp = new Scanner(System.in);
    private static int[] nums = null; // Declare the array
    public static void main(String[] args) throws Exception {
        
        System.out.print("How many numbers would you like to input? ");
        final int SIZE = inp.nextInt(); // final (or in caps) means the variable cannot be modified further
        
        nums = new int[SIZE];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Please enter an integer: ");
            nums[i] = inp.nextInt();
        }

        System.out.print("Your list of numbers is: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
            
        }
        printArr();
        // Double the array
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }
    }

    private static void printArr() {
        System.out.println("Your list of numbers is: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }

        System.out.println(nums[nums.length - 1] + " . ");
    }
}
