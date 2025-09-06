package Lab_2.problem_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class EventScheduler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter event name: ");
        String eventName = sc.nextLine();

        System.out.printf("Enter event Date, format yyyy-MM-dd: ");
        LocalDate eventDate = LocalDate.parse(sc.nextLine());

        System.out.printf("Enter event Time, format HH:mm : ");
        LocalTime eventTime = LocalTime.parse(sc.nextLine());


        LocalDateTime dateTime = LocalDateTime.of(eventDate,eventTime);

        ZoneId systemZome = ZoneId.systemDefault();

        Event event = new Event(eventName, dateTime, systemZome);
        System.out.println("\n========= EVENT DETAILS ========\n");
        event.getFormatEventDetails();
        event.getEventDayOfWeek();
        event.getDayDifference();
        System.out.println("==============================");


        System.out.printf("Enter Timezone to show event differently : ");
        String newTimeZone = sc.nextLine();
        sc.close();

        ZoneId newZone = ZoneId.of(newTimeZone);
        event.changeTimeZone(newZone);

        System.out.println("\n=== EVENT DETAILS IN NEW TIME ZONE ===\n");
        event.getFormatEventDetails();
        event.getEventDayOfWeek();
        event.getDayDifference();
        System.out.println("==============================");

    }
}
