public class CoolNumbers {

    public static boolean isCoolNumber(int n) {
        return ((n % 3 == 1) && (n % 4 == 1) && (n % 5 == 1) && (n % 6 == 1));
    }

    public static int countCoolNumbers(int n) {
        int count = 0;
        for (int i = 6; i <= n; i++) {
            if (isCoolNumber(i)) {
                count++;
            }
        }
        return count;
    }
}
