public class LeapCalc {
    private int year; 

    public boolean leapYear() {
        if (year % 4 == 0|| year % 400 == 0) {
            return true;
        }
        return false;
    }
}
