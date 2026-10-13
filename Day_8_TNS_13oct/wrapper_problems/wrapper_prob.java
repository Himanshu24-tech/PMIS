// Problem 1: Parse and sum a comma-separated string Task: Given a string of numbers separated by commas,
// extract each number and calculate the total sum. Key concept: Integer.parseInt() or Integer.valueOf().
package Day_8_TNS_13oct.wrapper_problems; 
public class wrapper_prob {
    public static void main(String[] args){
        String input ="12,34,35,24,54";
        String[] parts = input.split(",");
        int sum = 0;

        for(String part : parts){
            sum += Integer.parseInt(part);
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
