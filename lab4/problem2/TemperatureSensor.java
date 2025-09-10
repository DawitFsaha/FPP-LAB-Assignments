package lab4.problem2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TemperatureSensor implements Sensor{
    private double temperature;
    private String location;
    private Date lastUpdated;

    public TemperatureSensor(double temperature, String location, Date lastUpdated) {
        this.temperature = temperature;
        this.location = location;
        this.lastUpdated = lastUpdated;
    }

    public String getSensorType(){
        return "Temperature";
    }
    public double getReading(){
        return temperature;
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
        if(temperature > 30)
            return "An alert to turn on the AC";
        else if(temperature < 18)
            return "An alert to turn on the Heater";
        else
            return "Temperature is in normal range";

    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
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
