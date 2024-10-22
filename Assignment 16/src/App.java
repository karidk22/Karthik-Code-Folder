// Assignment 16
// Karthik Raghavun
// 22 October 2024
// Calculating the perimeter and area of a triangle with user input

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the triangle calculator!");
        System.out.println("Please enter the length of side a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the length of side b: ");
        int b = scanner.nextInt();
        System.out.println("Please enter the length of side c: ");
        int c = scanner.nextInt();

        double Perimeter = a + b + c;
        System.out.println("The perimter of the triangle is " + Perimeter);

        double s = Perimeter / 2;
        double Area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("The area of the triangle is " + Math.round(Area));


    }
}
