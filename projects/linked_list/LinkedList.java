

public class LinkedList  implements List{

    private Node head;
    private int listCount;

    public LinkedList() {

        head = new Node();
        listCount = 0;
    }

    public boolean add(String data) {
        Node temp = new Node();
        temp.info = data;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
        listCount++;
        return true;
    }

    public boolean add(String data, int index) {
        Node temp = new Node();
        temp.info = data;
        Node current = head;

        for (int i = 1; i < index && current.next != null; i++) {
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
        listCount++;
        return true;
    }

    public String get(int index) {

        if (index <= 0)
            return null;

        Node current = head.next;
        for (int i = 1; i < index; i++) {
            if (current.next == null)
                return null;

            current = current.next;
        }
        return current.info;
    }

    public boolean remove(int index) {

        if (index < 1 || index > size())
            return false;

        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.next == null)
                return false;

            current = current.next;
        }
        current.next = current.next.next;
        listCount--;
        return true;
    }

    public boolean contains(String s) {
        Node current = head.next;
        boolean found = false;
        while (current.info != null && !found) {
            if (current.info.equals(s)) {
                found = true;
            }
            current = current.next;
        }
        return found;
    }

    public int size() {
        return listCount;
    }

    public String toString() {
        Node current = head.next;
        String output = "";
        while (current != null) {
            output += "[" + current.info.toString() + "]";
            current = current.next;
        }
        return output;
    }
   
    public boolean remove(String data)
       {
          Node previous=head.next;
          Node current=head.next;
          while(!current.info.equals(data)){
                if(current.next==null){
                   return false;
                }
                else{
                   previous=current;
                   current=current.next;
                }
           }
           if(current==head.next){
             head=head.next;
             listCount--;
             return true;
           }
           else{
               previous.next=current.next;
               listCount--;
               return true;
          }
       }   
}