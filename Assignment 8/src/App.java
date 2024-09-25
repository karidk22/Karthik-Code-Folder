import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         Scanner keyboard = new Scanner(System.in);

      int intOne, intTwo; 

      System.out.print("Enter an integer :: ");

      intOne = keyboard.nextInt();

 

      System.out.print("Enter an integer :: ");

      intTwo = keyboard.nextInt();

 

      System.out.println("integer one = " + intOne);

      System.out.println("integer two = " + intTwo);

      System.out.println((String)("intOne + intTwo = ") + ((int)intOne + intTwo));
    }
}
