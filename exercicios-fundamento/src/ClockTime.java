import java.time.Clock;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ClockTime {

  public static void main(String[] args) {
    Clock relogio = Clock.systemDefaultZone();
    System.out.println(relogio);
    System.out.println(relogio.instant());

    LocalDateTime horaLocal = LocalDateTime.now();
    System.out.println(horaLocal);

    LocalDateTime dateTime = LocalDateTime.of(2024, 5, 3,
        20, 30, 0); // 2023-07-11T10:30:00
    System.out.println(dateTime);

    int year = dateTime.getYear();
    System.out.println(year);
    Month month = dateTime.getMonth();
    System.out.println(month);
    int dayOfMonth = dateTime.getDayOfMonth();
    System.out.println(dayOfMonth);
    int hour = dateTime.getHour();
    System.out.println(hour);
    int minute = dateTime.getMinute();
    System.out.println(minute);
    int second = dateTime.getSecond();
    System.out.println(second);

    LocalDateTime newDateTime = dateTime.plusYears(1);
    System.out.println(newDateTime);

    LocalDateTime newDate = dateTime.minusMonths(2);
    System.out.println(newDate);

    LocalDateTime alterDate = dateTime.withYear(2026);
    System.out.println(alterDate);

    LocalDateTime dateTime1 = LocalDateTime.of(2023, 7, 11, 10, 30, 0); // 2023-07-11T10:30:00
    LocalDateTime dateTime2 = LocalDateTime.of(2022, 10, 21, 10, 30, 0); // 2022-10-21T10:30:00
    boolean isBefore = dateTime1.isBefore(dateTime2); // dateTime1 é anterior a dateTime2? false
    boolean isAfter = dateTime1.isAfter(dateTime2); // dateTime1 é posterior a dateTime2? true
    boolean isEqual = dateTime1.isEqual(dateTime2); // dateTime1 é igual a dateTime2? false

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String formattedDateTime = dateTime.format(formatter);
    System.out.println(formattedDateTime);
  }
}
