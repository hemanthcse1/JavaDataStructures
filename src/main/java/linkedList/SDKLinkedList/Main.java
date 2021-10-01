package linkedList.SDKLinkedList;


import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee hemanth = new Employee("Hemanth", "Kumar", 101);
        Employee anil = new Employee("Anil", "Kumar", 102);
        Employee kiran = new Employee("Kiran", "Kumar", 103);
        Employee tejas = new Employee("Tejas", "Kumar", 104);

        LinkedList<Employee> list = new LinkedList<>();

        // add front
        list.addFirst(hemanth);
        list.addFirst(anil);
        list.addFirst(kiran);

        Iterator iterator = list.iterator();
        System.out.print("Head -> ");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(" <-> ");
        }
        System.out.println("null");

        // add end
        // list.add(tejas)

        // add end
       /* list.addLast(tejas);

        Iterator iterator1 = list.iterator();
        System.out.print("Head -> ");
        while (iterator1.hasNext()){
            System.out.print(iterator1.next());
            System.out.print(" <-> ");
        }
        System.out.println("null");*/


        // remove first
       /* list.removeFirst();

        Iterator iterator2 = list.iterator();
        System.out.print("Head -> ");
        while (iterator2.hasNext()){
            System.out.print(iterator2.next());
            System.out.print(" <-> ");
        }
        System.out.println("null");*/


        // remove last
        list.removeLast();

        Iterator iterator2 = list.iterator();
        System.out.print("Head -> ");
        while (iterator2.hasNext()){
            System.out.print(iterator2.next());
            System.out.print(" <-> ");
        }
        System.out.println("null");



    }
}
