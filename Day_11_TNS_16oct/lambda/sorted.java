import java.util.*;
import java.util.stream.Collectors;
public class sorted {
    public static void main(String[] args) {
        List<Integer> nums = List.of(523,2,4,6,74,1);
        List<Integer> res = nums.stream().sorted().collect(Collectors.toList());

        System.out.println(res);
    }
    
}
