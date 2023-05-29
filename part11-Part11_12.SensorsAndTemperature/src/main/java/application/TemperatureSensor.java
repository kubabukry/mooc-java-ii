package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean isOn;

    public TemperatureSensor(){
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        if(!isOn){
            isOn = true;
        }
        System.out.println(this.isOn);
    }

    @Override
    public void setOff() {
        if(isOn){
            isOn = false;
        }
        System.out.println(this.isOn);
    }

    @Override
    public int read() {
        if(isOn){
            int number = new Random().nextInt(61) - 30;
            return number;
        } else {
            throw new IllegalStateException("The sensor must be on");
        }
    }
}
