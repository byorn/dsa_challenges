package practice.recap;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class FunctionAndBiFunctionTest {

    /**Function is a category of functional interfaces that takes an object of type T and returns an object of type R.
     *
     * BiFunction teakes in T and U and return R
    /**
     * Function<T, R>
     * R apply(T t)
     * compose(Function<? super V, ? extends T> before)
     * andThen(Function<? super R,? extends V> after)
     *
     *  BiFunction<T,U,R>
     */
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

            System.out.println("Sum = " + add.apply(2, 3));


            BiFunction<Integer, Integer, String> addAndPrint = (a, b) -> String.valueOf(a + b);
            System.out.println("Sum = " + addAndPrint.apply(2, 3));


            /**
             *
             * The UnaryOperator<T> interface represents a function that takes one argument of type T and returns a value of the same type.
             *
             * This is similar to the Function interface, which is a parent to the UnaryOperator interface.
             *
             * byorn: see doco of UnaryOperator by clicking below
             */

            Person person = new Person("Byorn");
            UnaryOperator<Person> operator = (p) -> {
                p.name = "John";
                p.age = 34;
                return p;
            };

            operator.apply(person);
            System.out.println("Person Name: " + person.name + " Person Age: " + person.age);
        }
}
