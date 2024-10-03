package Linked_List;

public class q1_Implement_Singly_Linked_List{

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insert(10);
        sll.insert(1);
        sll.insert(0);
        sll.insert(11);

        sll.print();
        sll.length();

        sll.insertHead(11);
        sll.print();

    }
}
