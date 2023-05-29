import java.util.ArrayList;

public class Hideout<T> {
    private T hideout;

    public Hideout(){
        this.hideout = null;
    }

    public void putIntoHideout(T toHide){
        if(this.hideout == toHide){
            this.hideout = null;
        } else {
            this.hideout = toHide;
        }
    }

    public T takeFromHideout(){
        if(this.hideout == null){
            return null;
        }
        T temp = this.hideout;
        this.hideout = null;
        return temp;
    }

    public boolean isInHideout(){
        if(this.hideout != null){
            return true;
        }
        return false;
    }
}
