package Day_8_TNS_13oct.wrapper_problems;
// Problem 2: Count character types in a password Task: Given a password string, 
// count how many uppercase letters, lowercase letters, digits,
// and special characters it contains.Key concept: Built-in static utility methods of Character.
//password analyzer
public class wrapper_prob1 {
    public static void main(String[] args){
        String text = "Mumbai@1234";
        int upper = 0, lower=0, digit =0, special =0;

        for(char ch : text.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper++;
            } else if(Character.isLowerCase(ch)){
                lower++;
            } else if(Character.isDigit(ch)){
                digit++;
            } else {
                special++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special characters: " + special);
    }
}
    