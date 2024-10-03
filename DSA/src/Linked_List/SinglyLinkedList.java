package Linked_List;  // Define the package for organization

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;   //Data Stored in the Node
        private ListNode next;  //Reference to the next node

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Method to insert a new node at the end of the list
    public void insert(int value){
        ListNode newNode = new ListNode(value);

        if(head == null){
            head = newNode;
            return;
        }

        //Traverse to the end of the list
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }

        //Insert new node at the end
        current.next = newNode;
    }

    //Method to Display the List contents
    public void print(){
        ListNode current = head;
        while(current != null){
            //Check if the next node is null. if yes then don't print '->'
            if(current.next == null){
                System.out.print(current.data);
                System.out.println();
                return;
            }
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    //Method to Find the Length of a Singly Linked List
    public void length(){
        int length = 0;
        ListNode current = head;
        while(current != null){
            length += 1;
            current = current.next;
        }
        System.out.println(length);
    }



}
