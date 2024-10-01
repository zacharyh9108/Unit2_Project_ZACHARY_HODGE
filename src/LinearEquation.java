import java.lang.Math;
public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public int Equation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        return x1;
    }

    public int getSlope() {
        // Return value uses slope formula to calculate slope
        return (y2 - y1) / (x2 - x1);
    }

    public double getYIntercept() {
        return y1 / (getSlope() * x1);
    }

    public double distancePoint() {
        double a = Math.pow((x2 - x1), 2);
        double b = Math.pow((y2 - y1), 2);
        double x = a + b;
        double distance = Math.sqrt(x);
        return distance;

    }
}
