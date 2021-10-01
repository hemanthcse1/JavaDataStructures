package linkedList.doublyLinkedList;

public class Main {

    public static void main(String[] args) {

        Employee hemanth = new Employee("Hemanth", "Kumar", 101);
        Employee anil = new Employee("Anil", "Kumar", 102);
        Employee kiran = new Employee("Kiran", "Kumar", 103);
        Employee tejas = new Employee("Tejas", "Kumar", 104);


        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        list.addToFront(hemanth);
        list.addToFront(anil);
        list.addToFront(kiran);
        list.addToFront(tejas);


        Employee billEnd = new Employee("Bill","End",105);
        list.addToEnd(billEnd);

        System.out.println(list.getSize());
        list.printList();


       // list.removeFromFront();

        list.removeFromEnd();

        System.out.println(list.getSize());
        list.printList();




    }
}
