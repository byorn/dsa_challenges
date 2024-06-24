package practice.recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

interface Greeting{
    void greet();
}

// byorn: Lamdas are annoymouse functions
// they are not tied to a class like a regualar function
public class LearnLamda {

    public static void wish(Greeting greeting) {
        greeting.greet();
    }

    public static void main(String args[]) {
        //
        // What influences a lamda function ./
        //
        // We are passing an anonymous class object to the wish method.
        wish(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Namaste");
            }
        });


        wish(()-> {
            System.out.println("Yo hoooo");
        });


        //notice the Comparator interface has one abstract method.

        var list = Arrays.asList("a", "b", "c");
        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });


        // Predicate
        //---------------
        //The Predicate<T> interface has an abstract method boolean test(T t).
        // Basically, a predicate is a function that evaluates the given input and returns true or false.
        Predicate<Person> greaterThanEighteen = (p) -> p.age > 18;
        // Created a predicate. It returns true if age is less than 60.
        Predicate<Person> lessThanSixty = (p) -> p.age < 60;

        //can use 'or" as well
        Predicate<Person> predicate = greaterThanEighteen.and(lessThanSixty);
    }

}