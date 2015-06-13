public class Recursion{
   public static void main (String[] args){
        // PROBLEM 1:
        	
           int n=7;               
           countDown(n);      
     /*---------------------------------------------*/
     
     	// PROBLEM 2:
        
       int [] A={1,2,3,4,5,6,7,8};     
       int s=0;
       int e= A.length -1;
       System.out.print(isSorted(A, s,e));   
       
     /*---------------------------------------------*/ 
     	// PROBLEM 3:
       
         String input="HELLO THERE";     
       	 System.out.print("Number of Es : "+ numEs(input)); 
       	 
     /*---------------------------------------------*/ 
     
		// PROBLEM 4:
       	
       	 String s="HELLO";					
       	 System.out.print("Reverse of HELLO is: " + reverse(s));  
   }
   
   // PROBLEM 1: To print numbers from 1 to n 
   
  	public static void countDown(int n){        
      //if(n!=-1){
         System.out.print(n+ " ");
      
         if(n>0){
          countDown(n-1);
         }
   }
   
   // PROBLEM 2:To check whether the given array is sorted or not 
   
   	 public static boolean isSorted (int [] A, int s, int e){          
           if ((e+1) - s < 2) 
               return true;
         
           if (A[s] > A[s+1])
               return false;
         
           return isSorted(A, s+1,e);
           
          }
          
          
     // PROBLEM 3:To count number of given letter in a string 
          public static int numEs(String input){            
            int sLength=input.length();
            int s=0;
           
            if(sLength == 0){
               return 0;
            }
            if(input.charAt(s)== 'E'){
               return 1 + numEs(input.substring(1));
            }
             return numEs(input.substring(1));
                         
        }  
        
        //PROBLEM 4: Print reverse of the given string */
        
        public static String reverse(String s){                
         String revString="";
         int sLength=s.length();
            if(sLength<2){
               return s;
             }
                String  rev=  reverse(s.substring(1));
                 char c= s.charAt(0);
                 revString= rev + c;
            return revString;
        }
}
