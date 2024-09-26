// Assignment 8
// Karthik Raghavun
// 25 September 2024
// Using scanner keys. Asks for user inputs and does basic addition



import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         Scanner keyboard = new Scanner(System.in);

      // Integer

      int intOne, intTwo; 

      System.out.print("Enter an integer :: ");

      intOne = keyboard.nextInt();

      System.out.print("Enter an integer :: ");

      intTwo = keyboard.nextInt();

      System.out.println("integer one = " + intOne);

      System.out.println("integer two = " + intTwo);

      System.out.println((String)("intOne + intTwo = ") + ((int)intOne + intTwo));

      // Double

      double doubleOne, doubleTwo;

      System.out.println("Enter a double :: ");

      doubleOne = keyboard.nextDouble();

      System.out.println("Enter a double :: ");

      doubleTwo = keyboard.nextDouble();

      System.out.println("double one = " + doubleOne);
      System.out.println("double two = " + doubleTwo);
      System.out.println((String)("doubleOne + doubleTwo = ") + ((double)doubleOne + doubleTwo));
    }
}
