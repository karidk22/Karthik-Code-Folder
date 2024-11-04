import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        LoopStats loopStats = new LoopStats(0, 0);
        int beg = scanner.nextInt();
        int end = scanner.nextInt();
        loopStats.setNums(0, 0);
        loopStats.getEvenCount();
        loopStats.getOddCount();
        loopStats.getTotal();
    }
}
