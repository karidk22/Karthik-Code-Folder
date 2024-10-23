public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int a, int b, int c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double triPerm() {
        return sideA + sideB + sideC;
    }

    public double triArea() {
        double area = triPerm() / 2;
        return Math.sqrt(area * (area - sideA) * (area - sideB) * (area - sideC));
    }
    
}
