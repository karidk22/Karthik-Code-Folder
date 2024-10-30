// Assignment 22
// Karthik Raghavun
// 25 October 2024
// Checking if a given year by the user is a leap year. 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a year to check if it is a leap year: ");
        int year = scanner.nextInt();
        LeapCalc leapcalc = new LeapCalc();
        leapcalc.leapYear();

        if (year % 4 == 0|| year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        }
    }
