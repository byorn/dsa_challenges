package practice.recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsTest {

    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("far");
        list.add("away");
        list.add("again");

        /** i failed this in the interivew **/
        Map<String,Integer> nameMap = list.stream()
                .collect(Collectors.toMap(s -> s , s -> s.length()));


        Function<String, String> key = (String k) ->k;
        Function<String, Integer> value = (String v) ->v.length()+100;


        Map<String,Integer> nameMap1 = list.stream()
                .collect(Collectors.toMap(key, value));

        System.out.println(nameMap);
        System.out.println(nameMap1);
    }
}