import java.lang.Math;
public class LinearEquation {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Calculate and return the slope using the slope formula
    public double slope() {
        return (double)(y2 - y1) / (x2 - x1);
    }

    // Converts slope into fraction form if needed
    public String getSlope() {
        int numerator = (y2 - y1);
        int denominator = (x2 - x1);
        if (numerator % denominator == 0) {
            return String.valueOf(numerator / denominator);
        }
        else if (numerator < 0 && denominator < 0) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        else if (numerator > 0 && denominator < 0) {
            denominator = Math.abs(denominator);
        }
        return numerator + "/" + denominator;
    }

    // Calculate and return the y-intercept based on the slope and coordinates
    public double getYIntercept() {
        return Math.round((y1 - (slope() * x1)) * 100.0) / 100.0;
    }

    // Calculate and return the distance between two points using the distance formula
    public double distancePoints() {
        double a = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return Math.round(a * 100.0) / 100.0;
    }

    // Calculate and return the y-coordinate corresponding to x3 based on the slope-intercept form
    public double thirdYValue(double x3) {
        return Math.round(((x3 * slope()) + getYIntercept()) * 100.0) / 100.0;
    }
}
