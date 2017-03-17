import java.util.Scanner;

/**
 * Created by mlade on 16/03/2017.
 */
public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int countHolidays = Integer.parseInt(console.nextLine());

        final int countDaysPerYear = 365;
        final int playNormativeMinutes = 30000;

        int minutesHolidayPlayMinutes = countHolidays * 127;
        int workingDays = countDaysPerYear - countHolidays;
        int workingDaysPlayMinutes = workingDays * 63;

        int totalTimeToPlay = minutesHolidayPlayMinutes + workingDaysPlayMinutes;
        int difference = playNormativeMinutes - totalTimeToPlay;
        int hours = Math.abs(difference / 60);
        int minutes = Math.abs(difference % 60);

        if (totalTimeToPlay <= playNormativeMinutes){
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", hours, minutes);
        }else{
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", hours, minutes);
        }
    }
}
