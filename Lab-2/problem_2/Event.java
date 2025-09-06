package Lab_2.problem_2;


import java.time.*;
import java.time.temporal.ChronoUnit;

public class Event {
    private String eventName;
    private ZonedDateTime eventDateTime;

    public Event(String eventName, LocalDateTime eventDateTime, ZoneId zone){
        this.eventName = eventName;
        this.eventDateTime = eventDateTime.atZone(zone);
    }


    public void getEventDayOfWeek(){
        boolean isLeapYear = eventDateTime.toLocalDate().isLeapYear();
        System.out.println("Day of Week : "+eventDateTime.getDayOfWeek().toString());
        System.out.println("Is leap Year : "+ (isLeapYear?"Yes":"No"));
    }

    public  void getDayDifference(){
        long daysUntil = ChronoUnit.DAYS.between(LocalDate.now(), eventDateTime.toLocalDate());
        System.out.println("Days until event: " + daysUntil);
    }

    public void getFormatEventDetails(){
        System.out.println("Event name : " + eventName);
        System.out.println("Event Date & Time : " + eventDateTime);

    }

    public void changeTimeZone(ZoneId timeZone){

        this.eventDateTime = eventDateTime.withZoneSameInstant(timeZone);
    }



    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ZonedDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(ZonedDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
}

