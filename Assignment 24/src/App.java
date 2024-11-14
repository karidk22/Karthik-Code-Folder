// Assignment 24
// Karthik Raghavun
// 5 November 2024
// Even and Odd count

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); // Calling the scanner function

        System.out.print("Enter a number: ");
        int beg = scanner.nextInt(); // User inputs a number 

        System.out.print("Enter a second number: ");
        int end = scanner.nextInt(); // User inputs a second number 

        LoopStats loopStats = new LoopStats(beg, end); // Calling method LoopStats
        loopStats.Print(); // Calling the function in the method LoopStats


    }
}
