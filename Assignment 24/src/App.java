// Assignment 24
// Karthik Raghavun
// 5 November 2024
// Even and Odd count

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int beg = scanner.nextInt();

        System.out.print("Enter a number: ");
        int end = scanner.nextInt();

        LoopStats loopStats = new LoopStats(beg, end);
        loopStats.Print();


    }
}
