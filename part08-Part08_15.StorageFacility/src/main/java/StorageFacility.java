import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> store;

    public StorageFacility(){
        this.store = new HashMap<>();
    }

    public void add(String unit, String item){
        if(!this.store.containsKey(unit)){
            this.store.put(unit, new ArrayList<>());
            this.store.get(unit).add(item);
        } else if (this.store.containsKey(unit)){
            this.store.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit){
        if(!this.store.containsKey(storageUnit)){
            return new ArrayList<>();
        }
        if(this.store.get(storageUnit).isEmpty()){
            return new ArrayList<>();
        }
        return this.store.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item){
        this.store.get(storageUnit).remove(item);
        if(this.store.get(storageUnit).isEmpty()){
            this.store.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        return new ArrayList<String>(this.store.keySet());
    }
}
