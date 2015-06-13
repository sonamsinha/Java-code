package project.collections;

public interface List<T>
{
   public T get();
   
   public T get(int pos);
   
   /* add info List at position pos (0 = start of list) 
      if pos > size of the list, add it to the end */
   public boolean add(T info, int pos);
   
   /* add info to the end of list */
   public boolean add(T info);
   
   /* remove node from end of list - 
      note that we aren't concerned about what the node contains */
   public boolean remove();
   
   /* remove node at position pos (0 is start of list) */
   public boolean remove(int pos);
   
   /* remove first occurence of info from list */
   public boolean remove(T info);

   /* return true if List contains info, false otherwise */
   public boolean contains(T info);

   /* readable display of the List's contents */
   public String toString();

   /* number of nodes in the list */
   public int size();
   
   
   /* after you finish implementing the above methods, 
      uncomment the following methods and add those as well! */
   //public void sort();
   //public String[] toArray();
   //public String[] toArray(int start, int end);
}
