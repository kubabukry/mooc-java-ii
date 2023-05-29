package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        boolean isOn = false;
        for(Sensor sensor : sensors){
            if(sensor.isOn()==true){
                isOn = true;
            } else {
                isOn = false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        for(Sensor sensor : this.sensors){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor : this.sensors){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        int sum=0;
        int average;
        for(Sensor sensor : this.sensors){
            sum += sensor.read();
        }
        average = sum/this.sensors.size();
        this.readings.add(average);
        return average;
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    public List<Integer> readings(){
        return this.readings;
    }
}
