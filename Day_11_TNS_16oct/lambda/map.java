import java.util.stream.Collectors;
import java.util.*;

public class map {
    public static void main(String[] args) {
        //map : tranform each item.

        List<Integer> nums = List.of(2, 1, 3, 5, 6, 7);
        List<Integer> res = nums.stream()
        .map(n -> n* 2).collect(Collectors.toList()); //intermidiate operation
        System.out.println(res);

    }
    
}
