import java.util.Scanner;
import java.lang.String;
public class EquationRunner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first coordinate point: ");
        String userCoord1 = s.nextLine();


        Scanner w = new Scanner(System.in);
        System.out.print("Enter your second coordinate point: ");
        String userCoord2 = w.nextLine();

        String stringX1 = userCoord1.substring(userCoord1.indexOf("(") + 1, userCoord1.indexOf(","));
        String stringY1 = userCoord1.substring(userCoord1.indexOf(",") + 1, userCoord1.indexOf(")"));
        String stringX2 = userCoord2.substring(userCoord2.indexOf("(") + 1, userCoord2.indexOf(","));
        String stringY2 = userCoord2.substring(userCoord2.indexOf(",") + 1, userCoord2.indexOf(")"));

        int x1 = Integer.parseInt(stringX1);
        int y1 = Integer.parseInt(stringY1);
        int x2 = Integer.parseInt(stringX2);
        int y2 = Integer.parseInt(stringY2);

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);

        // Prints the coordinate pairs, slope, y-intercept, distance, and equation in slope-intercept form
        System.out.println();
        System.out.println("First pair: " + "(" + x1 + "," + y1 + ")");
        System.out.println("Second pair: " + "(" + x2 + "," + y2 + ")");
        System.out.println();

        if (equation.getYIntercept() < 0) {
            System.out.println("Equation: " + "y = " + equation.getSlope() + "x " + equation.getYIntercept());
        }
        else {
            System.out.println("Equation: " + "y = " + equation.getSlope() + "x" + " + " + equation.getYIntercept());
        }

        System.out.println();
        System.out.println("Slope: " + equation.getSlope());
        System.out.println("Y-Intercept: " + equation.getYIntercept());
        System.out.println("Distance between points: " + equation.distancePoints());
        System.out.println();

        Scanner z = new Scanner(System.in);
        System.out.print("Enter third x-value: ");
        String userX3 = z.nextLine();
        double x3 = Double.parseDouble(userX3);

        System.out.println("Solved third pair: " + "(" + x3 + "," + equation.thirdYValue(x3) + ")");
    }
}
