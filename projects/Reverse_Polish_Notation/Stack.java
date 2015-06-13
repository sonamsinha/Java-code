public class Stack<Integer>{
   int n;
   Node<Integer> head;
   
   public Stack(){
      head=null;
      n=0;
   }
   public boolean isEmpty(){
      return head== null;
   }
   
   public int size(){
      return n;
   }
   
   public void push(Integer data){
      Node newNode= head;
      head= new Node();
      head.info= data;
      head.next= newNode;
      n++;
   }
   
   public Integer pop(){
      Integer info= head.info;
      head = head.next;
      return info;
   }
   
   public Integer peek(){
      return head.info;
   }
      
}