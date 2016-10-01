/**
 * Created by sonamsinha on 9/27/16.
 */

import java.util.Scanner;
public class LoopControl {
    public static void main(String[] args){

        //Sentinel value termination of program
        int data = 0;
        int sum =0;

        //Using While Loop
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter a number except 0 until you want program to terminate ");
        data =input.nextInt();

        while(data!= 0){
            sum +=data;

            System.out.print("Enter a number except 0 until you want program to terminate ");
            data =input.nextInt();
        }
        System.out.println("Sum is " + sum);*/

        //Using Do-While Loop

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number except 0 until you want program to terminate ");
            data = input.nextInt();

            sum += data;
        }    while(data!= 0);

        System.out.println("Sum is " + sum);
    }

}
