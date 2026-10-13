package Day_8_TNS_13oct.wrapper_problems;
import java.util.ArrayList;
import java.util.List;


// Filter odd numbers from an ArrayList Task: Create an ArrayList<Integer> with
//  mixed numbers, remove all odd numbers, and print the remaining list.
//  Key concept: Autoboxing, unboxing, and collections requiring wrapper types
//  instead of primitives. Key concept: Integer cache between -128 and 127. 
public class wrapper_prob2 {

    public static void main(String[] args) {
        //wrapper class required here ArrayList<Int> is invaild
        List<Integer> numbers = new ArrayList<>();
        //autoboxing: primitive int is automatically converted to Integer wrapper class
        numbers.add(15);
        numbers.add(57);
        numbers.add(22);
        numbers.add(88);    
        numbers.add(99);
        numbers.add(100);

        List<Integer> evens = new ArrayList<>();
        for (Integer num: numbers) {
            //unboxing: Integer wrapper class is automatically converted to primitive int
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        System.out.println("Even numbers: " + evens);

        
    
}
}
