import java.time.LocalDate;
import java.time.Month;
public class datetime {

    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        System.out.println("todays date is + now");
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();

        System.out.println("Day :" +dayOfMonth);
        System.out.println("Month: "+ month);
        System.out.println("Year :"+ year);
    }
}
