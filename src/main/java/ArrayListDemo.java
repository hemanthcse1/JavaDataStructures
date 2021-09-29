import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee("Hemanth","Kumar",101));
        employeesList.add(new Employee("Anil","Arjun",102));
        employeesList.add(new Employee("Manasree","Raghava",103));
        employeesList.add(new Employee("Tejas","Kumar",104));

        /*employeesList.forEach(employee -> System.out.println(employee));

        System.out.println(employeesList.get(1));

        System.out.println(employeesList.isEmpty());*/

        employeesList.set(2,new Employee("Manasree","M",103));

        System.out.println(employeesList.size());

        employeesList.add(3,new Employee("Kiran","Kumar",105));

        //employeesList.forEach(employee -> System.out.println(employee));


        Employee[] employeeArray = employeesList.toArray(new Employee[employeesList.size()]);

       /* for (Employee employee: employeeArray){

            System.out.println(employee);
        }*/

        System.out.println(employeesList.contains(new Employee("Tejas","Kumar",104)));

        System.out.println(employeesList.indexOf(new Employee("Tejas","Kumar",104)));

        employeesList.remove(3);

       // System.out.println(employeesList.remove(4));

        employeesList.forEach(employee -> System.out.println(employee));

    }
}
