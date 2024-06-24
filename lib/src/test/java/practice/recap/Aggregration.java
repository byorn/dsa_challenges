package practice.recap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aggregration {

    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000));
        employeeList.add(new Employee("Ben", 63, 25000));
        employeeList.add(new Employee("Dave", 34, 56000));
        employeeList.add(new Employee("Jodi", 43, 67000));
        employeeList.add(new Employee("Ryan", 53, 54000));

        /** counting **/

        long count = employeeList.stream()
                .filter(emp -> emp.getAge() > 30)
                .collect(Collectors.counting()); // Using the counting() method to get count of employees.


        // Using summingInt() method to get the sum of salaries of all employees.
        int sum = employeeList.stream()
                .collect(Collectors.summingInt(emp -> emp.getSalary()));


        //avg
        double average = employeeList.stream()
                .collect(Collectors.averagingInt(emp -> emp.getSalary()));


        Optional<Employee> employeeOpt = employeeList.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

        Optional<Employee> employeeOpt1 = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));


        String joinedString = Stream.of("hello", "how", "are" , "you")
                .collect(Collectors.joining(" " , "prefix","suffix"));


        System.out.println(count);
        System.out.println(sum);
        System.out.println(average);
        System.out.println(employeeOpt);
        System.out.println(employeeOpt1);
        System.out.println(joinedString);
    }
}

