package practice.recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsTest2 {

    public static void main(String args[]) {

        //if the list has duplicate values the Collections.toMap will fail

        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("far");
        list.add("away");
        list.add("done");

        //pass additional function to say which one to chose
        Map<String,Integer> nameMap = list.stream()
                .collect(Collectors.toMap(s -> s , s -> s.length(), (s1,s2) -> s1));


              System.out.println(nameMap);




        List<String> list2 = new ArrayList<>();
        list2.add("done");
        list2.add("far");
        list2.add("away");
        list2.add("done");

        List<String> unmodifiableList = list2.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        System.out.println(unmodifiableList);

        Function<List<String>, String> finisher = (List<String> s)->"asdfasf"+s.size();

        String newList = list2.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), finisher));

        System.out.println(newList);

    }
}