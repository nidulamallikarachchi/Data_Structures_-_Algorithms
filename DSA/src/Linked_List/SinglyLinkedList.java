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


    //Method to Change Head of the Linked List
    public void insertHead(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new Node at a given position in the linked list
    public void insertAtPosition(int position, int value) {
        // Create the new node with the given value
        ListNode newNode = new ListNode(value);

        // Check if the position is valid (must be greater than or equal to 1)
        if (position < 1) {
            // If the position is less than 1, throw an exception indicating invalid position
            throw new IndexOutOfBoundsException("Index Out of Bounds");
        }

        // Special case: If inserting at position 1 (the head of the list)
        if (position == 1) {
            // Point the new node's next reference to the current head
            newNode.next = head;
            // Make the new node the head of the list
            head = newNode;
            // Exit the method since the insertion at the head is done
            return;
        }

        // Initialize a pointer to traverse the list, starting at the head
        ListNode previous = head;
        // `count` keeps track of the current position as we traverse the list
        int count = 1;

        // Traverse the list to find the node just before the insertion position
        while (count < position - 1 && previous != null) {
            // Move to the next node
            previous = previous.next;
            // Increment the position counter
            count++;
        }

        // If `previous` becomes null, it means the position is out of bounds
        // (i.e., the position is greater than the length of the list)
        if (previous == null) {
            // Throw an exception indicating invalid position
            throw new IndexOutOfBoundsException("Index Out of Bounds");
        } else {
            // Insert the new node by linking it into the list
            // Set the new node's next to point to the current node at the desired position
            newNode.next = previous.next;
            // Set the previous node's next to point to the new node
            previous.next = newNode;
        }
    }





}
