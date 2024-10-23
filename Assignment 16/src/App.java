// Assignment 16
// Karthik Raghavun
// 22 October 2024
// Calculating the perimeter and area of a triangle with user input

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the triangle calculator!");

        System.out.println("Please enter the length of side A: ");
        int sideA = scanner.nextInt();
        System.out.println("Please enter the length of side B: ");
        int sideB = scanner.nextInt();
        System.out.println("Please enter the length of side C: ");
        int sideC = scanner.nextInt();

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        double perimeter = triangle.triPerm();
        double area = triangle.triArea();

        System.out.println("The perimeter of the triangle is: " + perimeter);
        System.out.println("The area of the triangle is: " + area);


    }
}
