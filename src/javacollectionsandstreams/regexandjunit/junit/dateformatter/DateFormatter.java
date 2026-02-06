package javacollectionsandstreams.regexandjunit.junit.dateformatter;

import java.time.*;
import java.time.format.*;

public class DateFormatter {
    public String formatDate(String d) {
        return LocalDate.parse(d)
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
