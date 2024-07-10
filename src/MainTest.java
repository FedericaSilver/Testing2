import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testYear(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = data.getYear();
        assertEquals(2023, year);
    }
    @Test
    public void testMonth(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Month month = data.getMonth();
        assertEquals("MARCH", month.name());
    }
    @Test
    public void testDay(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int day = data.getDayOfMonth();
        assertEquals(1, day);
    }

    @Test
    public void testDayOfWeek(){
        //OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        ZonedDateTime data1 = ZonedDateTime.parse("2023-03-01T13:00:00Z");
        DayOfWeek dayOfWeek = data1.getDayOfWeek();
        assertEquals("WEDNESDAY", dayOfWeek.name());
    }



}