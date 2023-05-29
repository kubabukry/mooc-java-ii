import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double max = 0;
        for(double value : history){
            if(value>max){
                max = value;
            }
        }
        return max;
    }

    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double min = this.maxValue();
        for(double value : history){
            if(value<min){
                min = value;
            }
        }
        return min;
    }

    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(double value : history){
            sum+=value;
        }
        double average = sum/this.history.size();
        return average;
    }

    public String toString(){
        return this.history.toString();
    }
}
