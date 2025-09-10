package lab4.problem2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LightSensor implements Sensor{
    private double lightLevel;
    private String location;
    private Date lastUpdated;

    public LightSensor(double lightLevel, String location, Date lastUpdated) {
        this.lightLevel = lightLevel;
        this.location = location;
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String getSensorType(){
        return "Light";
    }

    @Override
    public double getReading(){
        return lightLevel;
    }

    @Override
    public String getLocation(){
        return location;
    }

    @Override
    public String getLastUpdated(){
        lastUpdated = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        return sdf.format(lastUpdated);
    }

    @Override
    public String performAction(){
        if(lightLevel < 100)
            return "An alert to turn on the light";
        else
            return "Light is sufficient";
    }

    public void setLightLevel(double lightLevel) {
        this.lightLevel = lightLevel;
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
