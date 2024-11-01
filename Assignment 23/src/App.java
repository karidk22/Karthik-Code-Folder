// Assignment 23
// Karthik Raghavun
// 1 November 2024
// Checking how many cool numbers are between 6 and the user's input. 
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int userCool = scanner.nextInt();

        int coolNumberCount = CoolNumbers.countCoolNumbers(userCool);
        System.out.println(coolNumberCount + " Cool numbers between 6 and " + userCool);
    }
}
