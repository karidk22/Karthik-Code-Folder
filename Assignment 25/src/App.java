public class App {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 10; i++) {

        x = (int) (Math.random() * 500);
        y = (int) (Math.random() * 500);


        if (x > y) {
            System.out.println("The biggest number is " + x + " \nThe smallest number is " + y + "\n");
        }

        if (x < y) {
            System.out.println("The biggest number is " + y + "\nThe smallest number is " + x + "\n");
        }
    }

    }
}
