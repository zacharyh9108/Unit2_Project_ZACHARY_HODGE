import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        LinearEquation equation = new LinearEquation(1, 2, 3, 4);
        int slope = equation.getSlope();
        int yIntercept = equation.getYIntercept();
        double distance = equation.distancePoint();
        System.out.println(slope);
        System.out.println(yIntercept);
        System.out.println(distance);
        System.out.println("Your equation: y = " + slope + "x " + "+ " + yIntercept);


        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first coordinate point: ");
        String userCoord1 = s.nextLine();


        Scanner x = new Scanner(System.in);
        System.out.print("Enter your second coordinate point: ");
        String userCoord2 = s.nextLine();


        System.out.println("First pair: " + userCoord1.substring(1, 2));
        System.out.println("Second pair: " + userCoord2.substring(3, 4));
    }
}
