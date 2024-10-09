// Assignment 10
// Karthik Raghavun
// 9 October 2024
// Taking two numbers from the user inputted in a parameter and evaluting. 

public class sumrunner {
    public static void main(String[] args) throws Exception {

        sum test = new sum();
        test.setNums(2, 3);
        test.sum();
        test.printsum();
        test.setNums(8, 4);
        test.sum();
        test.printsum();
        test.setNums(100, 1);
        test.sum();
        test.printsum();
    }
}
