package practice.recap;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LearnLamdaBiPredicate {

    static boolean isPersonEligibleForVoting(
            Person person, Integer minAge, BiPredicate<Person, Integer> predicate) {
        return predicate.test(person, minAge);
    }

    public static void main(String args[]) {
        Person person = new Person("Alex", 23);


        /***
         *
         * The Predicate<T> takes only one parameter and returns the boolean result.
         *
         * Now suppose we have a requirement where we need to send two parameters (i.e person object and min age to vote)
         * and then return the result. Here, we can use BiPredicate<T, T>.
         *
         *
         */



        boolean eligible =
                isPersonEligibleForVoting(
                        person,
                        18,
                        (p, minAge) -> {
                            return p.age > minAge;
                        });
        System.out.println("Person is eligible for voting: " + eligible);
    }
}

