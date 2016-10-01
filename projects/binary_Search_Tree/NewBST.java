import java.util.Scanner;
import java.util.ArrayList;

class Node
{
   Node left;
   Node right;
   int info;
   public Node(int info)
   {
      this.info = info;
   }
}
public class NewBST
{
   public Node root;
   
   public NewBST()
   { }   
   // ADD
   public boolean add(int info){
      if( root == null )
      {
         root = new Node(info);
         return true;
      }
      else
         return addRec(info, root);
   }
   public boolean addRec(int info, Node n)
   {
      if( info <= n.info )
      {
         if( n.left == null )
         {
            n.left = new Node(info);
            return true;
         }
         else
         {
            return addRec(info, n.left);            
         }
      }
      if( info > n.info )
      {
         if( n.right == null )
         {
            n.right = new Node(info);
            return true;
         }
         else
         {
            return addRec(info, n.right);            
         }
      }
      return true;
   }
   // CONTAINS
   public boolean contains( int v )
   {
      return contains(v, root);
   }
   public boolean contains( int v, Node n )
   {
      if(n== null){
      	return false;
      }
      else if(v == n.info){
      	return true;
      }
      else if(v <n.info){
      	return contains(v,n.left);
      }
      else{
      	return contains(v, n.right);
      }
      //return true;
	}
// MIN
   public int min(Node n)
   {
      if( n.left != null )
         return min(n.left);
      return n.info;
   }
   // REMOVE
 /*  public boolean removeRec(int info, Node n)
   {
      if( n.info > info )
      {
         if( n.left == null )
            return false;
         if( n.left.info == info )
         {
            if( n.left.left == null )
            {
               n.left = n.left.right;
            }
            else if( n.left.right == null )
            {
               n.left = n.left.left;
            }
            else  // two children
            {
               int val = min(n.left.right);
               n.left.info = val;
               removeRec(val, n.left);
            }
            return true;
         }
         else
         {
            return removeRec(info, n.left);
         }
      }
      else if( n.info <= info )
      {
         if( n.right == null )
            return false;
         if( n.right.info == info )
         {
            if( n.right.left == null )
            {
               n.right = n.right.right;
            }
            else if( n.right.right == null )
            {
               n.right = n.right.left;
            }
            else  // two children
            {
               int val = min(n.right.right);
               n.right.info = val;
               return removeRec(val, n.right);
            }
            return true;
         }
         else
         {
            return removeRec(info, n.right);
         }
      }
      return false;
   }
   public boolean remove(int info)
   {
      if( root == null )
         return false;     // no tree, not removed
      if( root.info == info )    //special case!
      {
         Node temp = new Node(info);
         temp.right = root;
         removeRec(info, temp);
         root = temp.right;
         return true;
      }
      else
      {
         return removeRec(info, root);
      }
   }
   */
   
  //HEIGHT
   public int height(Node n)
   {
      //fix this code!
      if(n==null){
      	return 0;
      }
      return 1+ Math.max(height(n.left), height(n.right));
   }
   public int height()
   {
      return height(root);
   }
   
   // DISPLAY
   public void display( int n ){
      if( n == 0 )
      {
         infix( root );
         System.out.println();
      }
      else if( n == 1 )
      {
         postfix( root );
         System.out.println();
      }
      else if( n == 2 )
      {
         prefix( root );
         System.out.println();
      }
   }
   // TRAVERSE
   public void prefix(Node n)
   {
   	if(n!=null)
   		System.out.print(n.info +" ");
   		prefix(n.left);
   		prefix(n.right);
   }
   
   public void postfix(Node n)
   {
   	if(n!=null){
   		postfix(n.left);
   		postfix(n.right);
   		System.out.print(n.info + " ");
   	}
   }
   
    public void infix(Node n)
   {
   	if(n!=null){
   		infix(n.left);
   		System.out.print(n.info + " ");
     		infix(n.right);	
   	}
   }

   
   public void infix(Node n, ArrayList<Integer> list)
   {
   	if(n!=null){
   		infix(n.left,list);
   		//System.out.print(n.info + " ");
   		list.add(n.info);
   		infix(n.right,list);	
   	}
   }
//BALANCE
   public void balance()
   {
   	ArrayList<Integer> list= new ArrayList<Integer>();
   	NewBST bst= new NewBST();
   	infix(root, list);
   	
   	balRec(list, 0, list.size()-1,bst);
   	//root= bst.root;
   	
   }
   
   public void balRec(ArrayList<Integer> list, int low, int high,NewBST bst){
      if( high<low){
         return;
      }
   	int mid= (low + high)/2;
   	bst.add(list.get(mid));
   	balRec(list, low, mid-1,bst);
   	balRec(list,mid+1, high,bst);
   }
   //SIZE
 /*  public int size(Node n){
   	if(root== null){
   		return 0;
   	}
   	else{
   		int count=1;
   		count+= size(n.left);
   		count+= size(n.right);
   		return count;
   	}
   }*/
  //MAIN     
   public static void main(String[] args)
   {
      Scanner inp = new Scanner(System.in);
      ArrayList<Integer> store = new ArrayList<Integer>();
      NewBST bst = new NewBST();
      int nCount = 0;     
      while( nCount < 32 )
      {
         int t = (int)(Math.random() * 36);
         if( !bst.contains(t) )
         {
            bst.add(t);
            store.add(t);
            nCount++;
            //System.out.println("Count: " +nCount);
         }
      }
      System.out.print( "Height of tree = " + bst.height());
      bst.balance();
      System.out.println();
      System.out.println( "Height of tree = " + bst.height());
      bst.display(0);
      /*while( store.size() > 0 )
      {
         int t = (int)(Math.random() * store.size());
         System.out.println( "Removing " + store.get(t) );
         bst.remove(store.get(t));
         store.remove(t);      
      }
      System.out.println( "Height of tree = " + bst.height());*/
   }
}