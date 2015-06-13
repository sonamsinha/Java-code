package com.data.bigint;

/**
 * Created by sonamsinha on 2/8/15.
 */
public class LinkedList implements List{


        public Node head;
        private int listCount=0;

        public LinkedList() {
            head = null;

        }

        public boolean add(int data) {

            Node tempNode = new Node();
            tempNode.info = data;
            tempNode.next = head;
            head = tempNode;
            listCount++;

            return true;
        }

        public boolean addLast(int data){
            Node tempNode = new Node();
            tempNode.info = data;
            tempNode.next = null;
            Node currentNode = head;
            if(currentNode != null){
                while(currentNode.next != null){
                    currentNode = currentNode.next;
                }
                currentNode.next = tempNode;
                return true;
            }else{
                currentNode = tempNode;
                return true;
            }
        }

        public int get(int index) {
            Node current = head;
            if (!(index > listCount)) {
                if (index >= 0) {
                    for (int i = 0; i < index; i++) {
                        if (current != null) {
                            current = current.next;
                        }
                    }
                    return current.info;
                }
            }else {
                System.out.print(" No such element exists ");
            }
            return -1;
        }





        public boolean add(int data, int index) {
            Node temp = new Node();
            temp.info = data;
            Node current = head;

            for (int i = 0; i < index && current.next != null; i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            listCount++;
            return true;
        }

        public int get() {
            Node current = head;
            if(current != null){
                return current.info;
            }
            return -1;
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

        public boolean contains(int data) {
            Node current = head.next;
            boolean found = false;
            while (current.info !=  data && !found) {
                if (current.info == data) {
                    found = true;
                    return found;
                }
                current = current.next;
            }
            return found;
        }

        public String toString() {
        Node current = head;
        String output = "";
        while (current != null) {
            output += "[" + current.info + "]";
            current = current.next;
        }
        return output;
    }

        public int size() {
            return listCount;
        }

        public boolean remove()
        {
            return false;
        }
}

