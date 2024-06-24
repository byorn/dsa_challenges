package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CombinationsTest {

@Test
    public void test() {
    Combinations combinations = new Combinations();
    List<List<Integer>> result = combinations.combine(3,2);

    System.out.println(result);
    System.out.println(result.size());

}
}
