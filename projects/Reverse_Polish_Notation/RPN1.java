import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.EmptyStackException;
//import java.lang.NumberFormatException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RPN1
{
   public static void main(String[] args)
   {
      Scanner inp = null;
      PrintWriter pw = null;
      String s = "";
      Stack<Integer> myStack = new Stack<Integer>();

      try
      {
         inp = new Scanner(new File("equations.dat"));   
         pw = new PrintWriter(new File("equationsOutput.dat"));
      }
      catch( FileNotFoundException fnfe )
      {

         System.out.println(fnfe);
         pw.println( fnfe );
         pw.close();
         System.exit(-1);
      }   
      int i = 1;
      while( inp.hasNext() )
      {
         s = inp.nextLine();
         pw.println( i + " --> " + s );
         StringTokenizer strTok = new StringTokenizer(s);
         int j=0;
         String term = "";
         try
         {
            while( strTok.hasMoreTokens() )
            {
               term = strTok.nextToken();
               pw.println( "" + i + (char)(j+'A') + " --> " + term );
               j++; 
               if( term.equals("+") )
               {
                  int a = myStack.pop();
                  int b = myStack.pop();
                  
                  myStack.push(a+b);
               }
               else if( term.equals("*") )
               {
                  int a=myStack.pop();
                  int b=myStack.pop();
                  myStack.push(a*b);

               }
               else if( term.equals("/") )
               {
                  int a=myStack.pop();
                  int b=myStack.pop();
                  myStack.push(a/b);

               }
               else if( term.equals("-") ) 
               {
                  int a=myStack.pop();
                  int b=myStack.pop();
                  myStack.push(a-b);
               }
               else /* must be a number? */
               {
                  int a = Integer.parseInt(term);
                  myStack.push(a);
               }
            }
            int result = myStack.pop();
            if( myStack.isEmpty() )
            {
               pw.println( " equals " + result );         
            }
            else
            {
               String rem = "Data left on stack --> ";
               while( !myStack.isEmpty() )
               {
                  rem += myStack.pop();
                  if( !myStack.isEmpty() )
                     rem += ", ";
               }
               pw.println( rem + ", FROM " + s );
            }
            i++;
         }
         catch( EmptyStackException ese )
         {
            pw.println( "Bad equation --> " + s );
         }
         catch( NumberFormatException nfe )
         {
            pw.println( "Bad Data --> " + term + ", from " + s );
         }
      }
      
      if( inp != null )
         inp.close();
      if( pw != null )
         pw.close();
   }
   
}   
   
   