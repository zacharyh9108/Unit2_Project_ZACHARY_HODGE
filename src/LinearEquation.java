import java.lang.Math;
public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    public int getSlope() {
        // Return value uses slope formula to calculate slope
        return (y2 - y1) / (x2 - x1);
    }

    public int getYIntercept() {
        return y1 - (getSlope() * x1);
    }

    public double distancePoint() {
        double a = Math.pow((x2 - x1), 2);
        double b = Math.pow((y2 - y1), 2);
        return Math.sqrt(a + b);
    }

    public double thirdXValue(double x3) {
        return (x3 * getSlope()) + getYIntercept();
    }
}

