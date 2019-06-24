import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;
import java.util.logging.Logger;

public class WholeWeeks {
    private static final Logger log = Logger.getLogger(WholeWeeks.class.getName());

    public static void main(String[] args) {
        int year;
        String startMonth, endMonth;
        log.info("Enter Year, start month, end month");
        Scanner scanner = new Scanner(System.in);
            year = scanner.nextInt();
            startMonth = scanner.next();
            endMonth = scanner.next();
            log.info(computeWholeWeeks(year,startMonth,endMonth)+" weeks are spent by John in Hawaii");

    }

    public static String computeWholeWeeks(int year, String startMonth, String endMonth){
        int firstMonday, lastSunday;
        try {
            firstMonday = calculateFirstMonday(year, startMonth);
            lastSunday = calculateLastSunday(year, endMonth);
            LocalDate firstDate = LocalDate.of(year, Month.valueOf(startMonth.toUpperCase()), firstMonday);
            LocalDate lastDate = LocalDate.of(year, Month.valueOf(endMonth.toUpperCase()), lastSunday + 1);
            return String.valueOf(ChronoUnit.WEEKS.between(firstDate, lastDate));
        }
        catch (Exception e){
          return e.getMessage();
        }
    }
    private static int calculateFirstMonday(int year, String startMonth){
        LocalDate startingMondayDate = LocalDate.of(year, Month.valueOf(startMonth.toUpperCase()), 1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        return startingMondayDate.getDayOfMonth();
    }

    private static int calculateLastSunday(int year, String endMonth){
        LocalDate lastSundayDate = LocalDate.of(year, Month.valueOf(endMonth.toUpperCase()), 1).with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        return lastSundayDate.getDayOfMonth();
    }

}
