
public class Main {
    public static void main(String[] args) {
//      ------------------  //single linked list
//        SinglyLinedList list = new SinglyLinedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(20);
//        list.insert(4,3);
//        list.display();
//        list.deleteByIndex(2);
//        list.deleteLast();
//        list.display();

        //---------------------//doubly Linked List
//
//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insertd(8, 65);
//        list.display();

        //Circular Linked List-----------------

        CircularLinkedList list = new CircularLinkedList();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);

        list.display();
        list.delete(19);
        list.display();

    }
}