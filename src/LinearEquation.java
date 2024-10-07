import java.lang.Math;
public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public double getSlope() {
        // Return value uses slope formula to calculate slope
        return (y2 - y1) / (x2 - x1);
    }

    public double getYIntercept() {
        return y1 - (getSlope() * x1);
    }

    public double distancePoint() {
        double a = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return Math.round(a * 100.00) / 100.00;
    }

    public double thirdXValue(double x3) {
        return (x3 * getSlope()) + getYIntercept();
    }
}

