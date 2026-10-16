
import java.util.*;
import java.util.function.*;
class supplier_lambda {
    public static void main(String[] args){

        Supplier<String> otpGen =() ->{
            Random random = new Random();
            int number = 100000 + random.nextInt(900000);
            return String.valueOf(number);

        };

        String userOtp = otpGen.get();
        System.out.println("th opt is"+ userOtp);
    }


}