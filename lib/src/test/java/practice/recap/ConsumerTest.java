package practice.recap;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 *
 * Consumer<T>
 * This interface takes a parameter of type T and does not return anything.
 */
public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<String> consumer1 = (arg) -> System.out.println(arg + "My name is Jane.");

        Consumer<String> consumer2 = (arg) -> System.out.println(arg + "I am from Canada.");

        consumer1.andThen(consumer2).accept("Hello. ");

        BiConsumer<String, String> greet = (s1, s2) -> System.out.println(s1 + s2);
        greet.accept("Hello", "World");
    }
}
