import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> hashMap;

    public Abbreviations(){
        this.hashMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.hashMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(this.hashMap.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        if(this.hasAbbreviation(abbreviation)){
            return this.hashMap.get(abbreviation);
        } else {
            return null;
        }
    }
}
