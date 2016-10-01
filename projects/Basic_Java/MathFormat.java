/**
 * Created by sonamsinha on 9/26/16.
 */

import java.util.Scanner;

public class MathFormat {
    public static void main (String[] args){
        double radius;
        double area;
        double side;
        final double PI = 3.145;

        Scanner input = new Scanner(System.in);
        System.out.print ("Enter radius of the pentagon ");
        //System.out.println();
        radius = input.nextDouble();

        side = 2 * radius * Math.sin(PI/5);
        area = (5*(side*side))/ (4* Math.tan(PI/5));

        System.out.println("Area of the pentagon of radius "+radius+ " is "+ area);
    }
}
