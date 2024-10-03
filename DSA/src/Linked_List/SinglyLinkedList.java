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
}
