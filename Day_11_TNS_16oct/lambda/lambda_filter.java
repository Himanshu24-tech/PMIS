import java.util.*;
import java.util.stream.Collectors;

public class lambda_filter {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5,12,8,3,47,7);
        List<Integer> result = nums.stream()
        .filter(n -> n>).collect(Collectors.toList());
        System.out.println(result);


    }
    
}
