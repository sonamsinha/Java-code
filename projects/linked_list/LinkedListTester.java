/* put this class in the same directory as your List, Node, and LinkedList classes */
/* run main and compare your result to mine - myOutput.txt */
public class LinkedListTester
{
   public static void main(String[] args)
   {
      System.out.println( "Sonam Sinha" );
      
      System.out.println( "Data Structures- Linked List" );
      LinkedList list = null;
      test(list);
   }
   public static void test(LinkedList list)
   {
      list = new LinkedList();
      
      display(list);      

      list.add("Sonam ");

      display(list);      
      
      list.add("Shaan");
      list.add("Pooja");

      display(list);      
      
      list.add("Gaurav");
      list.add("Apoorva");
      list.add("Amol");
      
      display(list);      
      
      list.remove(2);      
      //list.remove();      
      
      display(list);      
      
      if( list.remove(100) == true )
      {
         System.out.println( "We removed the hundredth element in the list!" );
      }
      else
      {
         System.out.println( "We were unable to remove the hundredth element in the list!" );
      }
      
      String name = "ARTHUR";
      
      if( list.contains(name) )
         System.out.println( name + " IS IN the list!" );
      else
         System.out.println( name + " IS NOT IN the list!" );
      
      name = "Charlie";
      if( list.contains(name) )
         System.out.println( name + " IS IN the list!" );
      else
         System.out.println( name + " IS NOT IN the list!" );

      name = "Evelyn";
      if( list.contains(name) )
         System.out.println( name + " IS IN the list!" );
      else
         System.out.println( name + " IS NOT IN the list!" );

      System.out.println(list.add("George", 3));
      System.out.println(list.add("Anna", 1));

      display(list);      
      
      list.remove(0);
      display(list);      
   }
   public static void display(LinkedList list)
   {
      System.out.println( "Size of list = " + list.size() );
      System.out.println( list );
   }
}