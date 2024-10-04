public class SubMethods {
    private double ans = 0;

    public void calc(int a, int b) {
        ans = (a * b) / (1.7965834524);
    }

    public void output() {
        System.out.println(ans);
        System.out.printf("%-18.3f",ans);

        /*
          %f - real/decimal number
          %d - intger
          %c - character value
          %s - string value
         */
    }
}
