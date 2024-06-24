package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {



    public static void main(String[] args) {
        var people = new ArrayList<Person>();
        people.add(new Person("byorn", 12));
        people.add(new Person("byorn", 12));
        people.add(new Person("byorn", 12));
        people.add(new Person("byorn", 12));
        people.add(new Person("shawn", 13));
        people.add(new Person("max", 15));
        people.add(new Person("max", 15));
        people.add(new Person("shantha", 16));
        people.add(new Person("shantha", 19));
        people.add(new Person("shantha", 19));

        var p1 = people.stream().filter((p)->p.age>=15).collect(Collectors.toList());
        //System.out.println(p1);

        Map<String, List<Person>> p2 = people.stream().collect(Collectors.groupingBy(person -> person.name));
        //System.out.println(p2);

        Comparator<Map.Entry<String,List<Person>>> comparator = ((o1, o2) -> {
            return -(o1.getValue().size() - o2.getValue().size());
        });


        var v1 = p2.entrySet().stream().sorted(comparator).toList();


        for (var o : v1) {
            System.out.println(o.getKey());
        }

        System.out.println(people.stream().map(p->p.age).reduce(100,(a,b)->a+b).toString());

    }

    static class Person{
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age;
        }
    }
}
