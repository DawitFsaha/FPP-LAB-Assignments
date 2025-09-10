package lab4.problem2;

import java.util.Date;

public class SensorTest {

    static void main() {
        Sensor s1 = new LightSensor(105,"Bed room",new Date());
        Sensor s2 = new TemperatureSensor(31, "Kichen", new Date());
        Sensor s3 = new SoundSensor(75,"Garden",new Date());
        Sensor s4 = new LightSensor(50,"Balcony",new Date());
        Sensor s5 = new TemperatureSensor(20,"Bed room",new Date());
        Sensor[] sensors = {s1, s2, s3, s4, s5};

        for(Sensor s : sensors){
            System.out.println(s);
        }
    }
}
