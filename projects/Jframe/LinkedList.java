package project.collections;

public class LinkedList<T> implements List<T>
{
   Node<T> root = null;
   //boolean operationSuccessful;// = false;
   
   public int size()
   {
      int s = 0;
      Node curNode = root;
      while( curNode != null )
      {
         curNode = curNode.next;
         s++;
      }
      return s;
   }
   
   public T get()
   {
      Node<T> curNode = root;
      if( curNode == null )
      {
         return null;
         //throw ( new LinkedListEmptyException("List is empty!") );//return null;
      }
      
      while( curNode.next != null )
      {
         curNode = curNode.next;
      }
      return curNode.info;
   }
   
   public T get(int pos)
   {
      Node<T> curNode = root;
      if( curNode == null )
      {
         return null;
         //throw ( new LinkedListEmptyException("List is empty!") );//return null;
      }
      while( curNode.next != null && pos > 0 )
      {
         curNode = curNode.next;
         pos--;
      }
      if( pos == 0 )
         return curNode.info;
      return 
         null;
   }
   
   public boolean contains(T info)
   {
      Node<T> curNode = root;
      while( curNode != null )
      {
         if( curNode.info.equals(info) )
            return true;
         curNode = curNode.next;
      }
      return false;
   }
   
   /* add to tail */
   public boolean add(T s)
   {
      Node<T> t = new Node<T>();
      t.info = s;
      if( root == null )
      {
         root = t;
         return true;
      }
      Node<T> curNode = root;
      while( curNode.next != null )
      {
         curNode = curNode.next;
      }
      curNode.next = t;
      return true;
   }
   
   public boolean add(T info, int pos)
   {
      Node<T> t = new Node<T>();
      t.info = info;
      int p;
      
      if( pos == 0 )
      {
         t.next = root;
         root = t;
         return true;
      }
      
      p = 1;
      Node<T> curNode = root;
      while( curNode.next != null && p != pos )
      {
         p++;
         curNode = curNode.next;   
      }
      t.next = curNode.next;
      curNode.next = t;     
      return true;
   }
   
   public boolean remove()
   {
      boolean success = false;
      Node<T> curNode = root;
      if( curNode == null )
      {
         return false;
      }
      if( curNode.next == null )
      {
         root = null;
         return true;
      }
      while( curNode.next.next != null )
      {
         curNode = curNode.next;
      }
      curNode.next = null;
      return true;
   }
   
   public boolean remove(int pos)
   {
      if( pos == 0 )
      {
         root = root.next;
         return true;
      } 
      Node<T> curNode = root;
      int p = 1;
      while( p != pos && curNode.next != null && curNode.next.next != null )
      {
         curNode = curNode.next;
         p = p + 1;
      }
      if( p == pos )
      {
         curNode.next = curNode.next.next;
         return true;
      }
      return false;
   }
   
   /* find and remove */   
   public boolean remove(T info)
   {
      Node<T> curNode = root;
      if( curNode == null )
      {
         return false;
      }
      if( curNode.info.equals(info) )
      {
         root = root.next;
         return true;
      }
      while( curNode.next != null && !curNode.next.info.equals(info) )
      {
         curNode = curNode.next;
      }
      if( curNode.next == null )
      {
         return false;
      }
      curNode.next = curNode.next.next;
      return true;
   }
   
   public String toString()
   {
      String s = "";
      Node<T> curNode = root;
      while( curNode != null )
      {
         s = s + curNode.info;
         curNode = curNode.next;
         if( curNode != null )
         {
            s = s + "\n";
         }
      }
      if( s.length() == 0 )
         return "The list is empty!";
      return s + "\n----------------------";
   }      
}