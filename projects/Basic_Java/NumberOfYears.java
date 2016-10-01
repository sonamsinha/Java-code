/**
 * Created by sonamsinha on 9/19/16.
 */
import java.util.Scanner;
public class NumberOfYears {
    public static void main(String[] args){
        int minutes;
        int years;
        int days;
        int remainder;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter minutes ");

        minutes = input.nextInt();
        years = minutes / 525600;
        remainder = minutes % 525600;

        days = remainder / 1440;

        System.out.println("Number of years = " + years + " and number of Days = " + days + " in "+ minutes + " minutes");
    }
}
