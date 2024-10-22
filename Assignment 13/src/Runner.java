// Assignment 13
// Karthik Raghavun
// 22 October 2024
// A calculator to calculate perimeter of a rectangle, a cube's surface area, and the radius of a circle by taking in the user's input. 
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws Exception {
        Scanner user = new Scanner(System.in);
        Calculations calculations = new Calculations();

        System.out.println("Please choose a calculation");
        System.out.println("1. Calculation for the perimeter of a rectangle");
        System.out.println("2. Calculation for the surface area of a cube");
        System.out.println("3. Calculation for the area of a circle");
        int choice = user.nextInt();

        if (choice == 1) {
            System.out.println("Please enter the length of the rectangle");
            double length = user.nextDouble();
            System.out.println("Please enter the width of the rectangle");
            double width = user.nextDouble();
            double perimeter = calculations.calcPerm(length, width);
            calculations.printResult("Rectangle's perimeter", perimeter);
        }

        else if (choice == 2) {
            System.out.println("Please enter the side length of the cube");
            double side = user.nextDouble();
            double surfacearea = calculations.calcSurfarea(side);
            calculations.printResult("Cube's surface area", surfacearea);
        }

        else if (choice == 3) {
            System.out.println("Please enter the radius of the circle");
            double radius = user.nextDouble();
            double area = calculations.calcArea(radius);
            calculations.printResult("Circle's area", area);
        } 
    }
}
