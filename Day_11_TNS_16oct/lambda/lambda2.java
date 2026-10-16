import java.util.function.*;
class lambda2{
    public static void main(String[] args){
        Consumer<String> smsNotifer = mobNo ->{
            System.out.println("Sending OTP " +  mobNo);

        };
        smsNotifer.accept("+91 7261985753");
        
    }

}