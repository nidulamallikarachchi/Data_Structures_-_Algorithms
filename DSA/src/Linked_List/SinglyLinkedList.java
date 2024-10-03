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

}
