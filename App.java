import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int userCool = scanner.nextInt();

        int coolNumberCount = CoolNumbers.countCoolNumbers(userCool);
        System.out.println(coolNumberCount + " Cool numbers between 6 and " + userCool);
    }
}
