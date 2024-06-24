package practice.recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceTest {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Dave", 23,20000));
        list.add(new Employee("Joe", 18,40000));
        list.add(new Employee("Ryan", 54,100000));
        list.add(new Employee("Iyan", 5,34000));
        list.add(new Employee("Ray", 63,54000));

        Optional<Integer> totalSalary = list.stream()
                .map(p -> p.getSalary())  //We are converting the Stream of Employees to Stream of salaries.
                .reduce((p,q) -> p + q);

        if(totalSalary.isPresent()){
            System.out.println("The total salary is " + totalSalary.get());
        }


        System.out.println("reduce with identity" + list.stream().map(Employee::getSalary).reduce(-9999999, (s1, s2)->s1 + s2));

        System.out.println(list.stream().mapToInt((emp)-> emp.getSalary()).sum());
    }

}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}