package linkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {

        Employee hemanth= new Employee("Hemanth","Kumar",101);
        Employee anil = new Employee("Anil","Kumar",102);
        Employee kiran = new Employee("Kiran","Kumar",103);
        Employee tejas = new Employee("Tejas","Kumar",104);


        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.addToFront(hemanth);
        employeeLinkedList.addToFront(anil);
        employeeLinkedList.addToFront(kiran);
        employeeLinkedList.addToFront(tejas);

        System.out.println(employeeLinkedList.getSize());


        employeeLinkedList.printList();

        employeeLinkedList.removeFromFront();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printList();


    }
}
