import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> packables;
    private double capacity;
    public Box(double capacity){
        this.capacity = capacity;
        this.packables = new ArrayList<>();
    }

    public void add(Packable packable){
        if(this.weight()+packable.weight()<=this.capacity){
            this.packables.add(packable);
        }
    }

    @Override
    public double weight(){
        double weight = 0;
        for(Packable item : this.packables){
            weight+=item.weight();
        }
        return weight;
    }
    @Override
    public String toString(){
        return "Box: "+this.packables.size()+" items, total weight "+this.weight()+" kg";
    }

}
