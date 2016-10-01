/**
 * Created by sonamsinha on 9/19/16.
 */

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

        int num = 0;
        int remainder;
        int addNum = 0;
        System.out.println("Enter a number between 0 and 1000 num= ");

        num = input.nextInt();
        remainder = num % 10;
        addNum = addNum + remainder;
        num = num / 10;
        remainder = num % 10;
        addNum = addNum + remainder;
        num = num / 10;
        remainder = num % 10;
        addNum = addNum + remainder;

        System.out.println( addNum);

    }
}
