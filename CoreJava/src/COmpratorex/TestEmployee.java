package COmpratorex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee(4, "Ram", 1000);
        Employee e2 = new Employee(2, "Shyam", 45000);
        Employee e3 = new Employee(3, "Ghanshyam", 52000);
        Employee e4 = new Employee(1, "Saket", 45333);
        Employee e5 = new Employee(5, "Shruti", 52000);

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println("Original List");

        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("----------------");

        // Sort by ID ascending
        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {

                return Integer.compare(e1.id, e2.id);
            }
        });

        System.out.println("Sort By ID Ascending");

        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("----------------");

        // Sort by Name
        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {

                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("Sort By Name");

        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("----------------");

        // Sort by Salary Descending
        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {

                return Integer.compare(e2.salary, e1.salary);
            }
        });

        System.out.println("Sort By Salary Descending");

        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("----------------");

       
    }
}