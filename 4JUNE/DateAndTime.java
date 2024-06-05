import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate mydate = LocalDate.now();
        System.out.println(mydate);

        LocalTime mytime = LocalTime.now();
        System.out.println(mytime);

        LocalDateTime mydatetime = LocalDateTime.now();
        System.out.println("Before formatting date and time : " + mydatetime);
        DateTimeFormatter formatedateandtime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = mydatetime.format(formatedateandtime);
        System.out.println("After formatting date and time : " + formattedDate);
    }
}