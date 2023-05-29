import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> movables;

    public Herd(){
        this.movables = new ArrayList<>();
    }

    public String toString(){
        String print = "";
        for(Movable movable : this.movables){
            print += movable.toString()+"\n";
        }
        return print;
    }

    public void addToHerd(Movable movable){
        this.movables.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable movable : this.movables){
            movable.move(dx, dy);
        }
    }
}
