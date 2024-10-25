public class MPHCalculations {
    private double distance;
    private double hours;
    private double minutes;

    public MPHCalculations(double dist, double hrs, double mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public double CalculateMPH() {
        double totalhrs = (double)(hours + (minutes / 60));
        if (totalhrs == 0) {
            return 0;
        }
        return distance / totalhrs;
    }

}
