package practice.recap;

import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

/****
 *
 * Supplier is an interface that does not take in any argument but produces a value when the get() function is invoked.
 *
 */
public class SupplierTest {

    static boolean isPersonEligibleForVoting(
            Supplier<Person> supplier, Predicate<Person> predicate) {
        return predicate.test(supplier.get());
    }


    public static void main(String[] args) {

        IntSupplier supplier = () -> (int)(Math.random() * 10);

        System.out.println(supplier.getAsInt());


        Supplier<Person> supplier1 = () -> new Person("Alex", 23);
        Predicate<Person> predicate = (p) -> p.age > 18;
        boolean eligible =
                isPersonEligibleForVoting(supplier1, predicate);
        System.out.println("Person is eligible for voting: " + eligible);
    }
}
