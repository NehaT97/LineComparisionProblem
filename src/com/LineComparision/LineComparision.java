package com.LineComparision;
import java.util.Scanner;

public class LineComparision
{
    /* Read the Coordinates*/
         private static Line readLineCoordinates()
         {
                Scanner scanner = new Scanner(System.in);

                System.out.print("X1 : ");
                double x1 = scanner.nextDouble();

                System.out.print("Y1 : ");
                double y1 = scanner.nextDouble();

                System.out.print("X2 : ");
                double x2 = scanner.nextDouble();

                System.out.print("Y2 : ");
                double y2 = scanner.nextDouble();
                return new Line(x1, x2, y1, y2);
         }

    /* UC1 : Calculate length of the line using cartesian system */
    public static double calculateLengthByCartesianSystem(final double x1, final double x2, final double y1, final double y2) {
        double xCoordinatePower = Math.pow((x2 - x1), 2);
        double yCoordinatePower = Math.pow((y2 - y1), 2);
        return Math.sqrt(xCoordinatePower + yCoordinatePower);
    }


    public static void main(String args[])
    {
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter the Line1 co-ordinates");
        Line line1 = readLineCoordinates();
        System.out.println("Length of the line is : " + calculateLengthByCartesianSystem(line1.getX1(), line1.getX2(), line1.getY1(), line1.getY2()));

        System.out.println("\nEnter the Line2 co-ordinates");
        Line line2 = readLineCoordinates();
        System.out.println("Length of the line is : " + calculateLengthByCartesianSystem(line2.getX1(), line2.getX2(), line2.getY1(), line2.getY2()));
    }
}
