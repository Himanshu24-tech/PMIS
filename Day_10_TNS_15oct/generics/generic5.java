import java.util.*;
import java.util.Arrays;

public class generic5 {
    public static void printList(List <?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args){
        List<String> names = Arrays.asList("Anish","varun","Himanshu");
        List<Integer> nums = Arrays.asList(100,99,99);
        List<Double> prices = Arrays.asList(99.5,56,85,99.9);

        System.out.println("name :");
        printList(names);
        System.out.println("\nNumbers");
        printList(nums);
        System.out.println("\nprices :");
        printList(prices);

    }
    
}
