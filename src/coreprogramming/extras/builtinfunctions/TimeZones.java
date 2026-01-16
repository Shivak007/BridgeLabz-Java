package coreprogramming.extras.builtinfunctions;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args){
        DateTimeFormatter formatting = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("The current time is " + gmt.format(formatting));

        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("The current time is " + ist.format(formatting));

        ZonedDateTime pct = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("The current time is " + pct.format(formatting));
    }
}
