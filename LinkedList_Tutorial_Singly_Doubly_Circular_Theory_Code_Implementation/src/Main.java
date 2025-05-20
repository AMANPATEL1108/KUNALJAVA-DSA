
public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(20);
        list.insert(4,3);
        list.display();
        list.deleteByIndex(2);
//        list.deleteLast();
        list.display();



    }
}