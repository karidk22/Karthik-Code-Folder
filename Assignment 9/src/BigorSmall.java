// Assignment 9
// Karthik Raghavun
// 8 October 2024
// Checking two parametres checking numbers with the functions, <, >, and ==



import java.util.Scanner;

public class BigorSmall {
    public static void main(String[] args) throws Exception {
        BigorSmallClass ab = new BigorSmallClass();  
        ab.check(10, 20);
        ab.check(20, 10);
        ab.check(20, 20);
        ab.check(10, 10);
        ab.check(0, 1);
        ab.check(1, 0);
        ab.check(3, 5);
        ab.check(5, 3);
        ab.check(55342, 323);

        
        
    }
}
