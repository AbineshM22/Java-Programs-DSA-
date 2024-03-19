import java.time.LocalDate;
import java.time.LocalTime;


public class IncreaseSecMinHourDateWeekMonthYearby2 {
    public static void main(String[] args) {
        LocalTime Sec=LocalTime.now();
        LocalTime IncNanSec=Sec.plusNanos(5);
        LocalTime IncSec=Sec.plusSeconds(5);
        LocalTime IncMin=Sec.plusMinutes(5);
        LocalTime IncHour=Sec.plusHours(5);

        System.out.println(IncNanSec + " "+IncSec +" "+IncMin +" "+ IncHour);

        LocalDate Date=LocalDate.now();
        LocalDate IncDate=Date.plusDays(6);
        LocalDate IncWeek=Date.plusWeeks(6);
        LocalDate IncMonth=Date.plusMonths(6);
        LocalDate IncYear=Date.plusYears(6);
        System.out.print(IncDate + " "+IncWeek +" "+IncMonth +" "+ IncYear);

 



    }
}
