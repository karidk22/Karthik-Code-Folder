public class Functions {

    public int num1, num2;

    public static double cTof(int a) {
        double num1 = a;
        double fahr = (((double)9/5) * num1 + 32);
        System.out.println(a + " degrees Celcius is " + fahr + " degrees Fahrenheit");
        return fahr;
        
    }

    public static double fToc(int b) {
        double num2 = b;
        double celc = (((double)5/9) * (num2 - 32));
        System.out.println(b + " degrees Fahrenheit is " + celc + " degrees Celcius");
        return celc;
       
    }
   

   
}