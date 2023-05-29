import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> pipe;

    public Pipe(){
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.pipe.add(value);
    }

    public T takeFromPipe(){
        if(this.pipe.size()==0){
            return null;
        }
        T temp = this.pipe.get(this.pipe.size()-1);
        this.pipe.remove(this.pipe.size()-1);
        return temp;
    }

    public boolean isInPipe(){
        if(this.pipe.isEmpty()){
            return false;
        }
        return true;
    }
}
