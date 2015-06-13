/*Sonam Sinha
  RecursionMethodTest.java
*/

import java.util.Scanner;
public class RecursionMethodTest{
   public static void main(String [] args){
      int n;    //no. of rings
      int s;    // startingpeg
      int e;   //endingpeg
      Scanner kbd= new Scanner(System.in);
      
      System.out.print("Enter number of rings: " );
      n= kbd.nextInt();
      
      System.out.print("Enter starting peg from 1 to 3: " );
      s= kbd.nextInt();
      
      System.out.print("Enter ending peg from 1 to 3: " );
      e= kbd.nextInt();
      RecursionMethods rec= new RecursionMethods();
      String result= rec.towerOfHanoi(n, s, e);
       System.out.println( result);
       System.out.println("Total number of steps= "+ rec.count);
      
   }
}

/*  Outut:

         Enter number of rings: 4
      Enter starting peg from 1 to 3: 1
      Enter ending peg from 1 to 3: 3
          1 --> 2  
 1 --> 3
 2 --> 1  
 1 --> 2
 3 --> 2  
 3 --> 1
 2 --> 3  
 1 --> 3
 2 --> 1  
 2 --> 3
 1 --> 2  
 2 --> 1
 3 --> 1  
 3 --> 2
 1 --> 3
            
      Total number of steps= 15
*/