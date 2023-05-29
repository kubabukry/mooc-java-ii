import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

public class Checker {

    public Checker(){
    }

    public boolean isDayOfWeek(String string){
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        if(string.matches(regex)){
            return true;
        }
        return false;
    }

    public boolean allVowels(String string){
        String regex = "[a|e|i|o|u]*";
        if(string.matches(regex)){
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string){
        try {
            LocalTime.parse(string);
            return true;
        } catch (DateTimeParseException | NullPointerException e){
            return false;
        }
    }
}
