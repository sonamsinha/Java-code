/*Sonam Sinha
  RecursionMethods.java
*/
   
/* Tower of hanoi using recursion*/

public class RecursionMethods{
    int count;
  /*n : numberOfDisks
    s : startPeg
    e : endPeg
  */ t: temporaryPeg
  public String towerOfHanoi(int n, int s, int e){
      int t;
      String solution1, solution2, tempStep, finalSolution;
     
         if(n==1){
            count++;
            return  s + " --> "+ e +"  \n" ;
         }
         else{
            t=6 - s - e;
            solution1= towerOfHanoi(n-1, s, t);
            tempStep= s +" --> " + e + "\n";
            solution2= towerOfHanoi(n-1, t, e);
            count++;
            finalSolution= solution1 + tempStep + solution2;
            return finalSolution;
         }
    }  
  }
  