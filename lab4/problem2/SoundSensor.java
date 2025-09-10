package lab4.problem2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SoundSensor implements Sensor{
    private double soundLevel;
    private String location;
    private Date lastUpdated;

    public SoundSensor(double soundLevel, String location, Date lastUpdated) {
        this.soundLevel = soundLevel;
        this.location = location;
        this.lastUpdated = lastUpdated;
    }

    public String getSensorType(){
        return "Sound";
    }

    public double getReading(){
        return soundLevel;
    }

    public String getLocation(){
        return location;
    }

    public String getLastUpdated(){
        lastUpdated = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        return sdf.format(lastUpdated);
    }

    public String performAction(){
        if(soundLevel > 70)
            return "An alert to turn on noise cancellation";
        else
            return "Sound is within normal range";

    }

    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
    }

    @Override
    public String toString() {
        return "\nSensor Type: " + getSensorType() +
                "\nReadings: " + getReading() +
                "\nLocation: " + getLocation() +
                "\nLast Updated: " + getLastUpdated() +
                "\nAction: " + performAction();
    }
}
