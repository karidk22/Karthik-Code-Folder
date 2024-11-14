public class App {
    public static void main(String[] args) throws Exception {
        double x = Math.random() * 500;
        double y = Math.random() * 500;
        x = (int) x;
        y = (int) y;

        if (x > y) {
            System.out.println("The biggest number is " + x + " \nThe smallest number is " + y);
        }

        if (x < y) {
            System.out.println("The biggest number is " + y + "\nThe smaller number is " + x);
        }

    }
}
