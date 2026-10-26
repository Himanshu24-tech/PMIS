import java.time.LocalDate;
import java.time.Month;
public class datetime2 {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();

        LocalDate customDate = LocalDate.of(2026,12,26);
        System.out.println(customDate);

        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();

        System.out.println("Day :" +dayOfMonth);
        System.out.println("\nMonth: "+ month);
        System.out.println("\nYear :"+ year);

    }
}
