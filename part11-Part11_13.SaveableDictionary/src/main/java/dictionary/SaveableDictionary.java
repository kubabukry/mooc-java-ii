package dictionary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveableDictionary {
    private List<String> dictionary;
    private String file;
    public SaveableDictionary(){
        this.dictionary = new ArrayList<>();
    }
    public SaveableDictionary(String file){
        this.dictionary = new ArrayList<>();
        this.file = file;
    }
    public void add(String words, String translation){
        this.dictionary.add(words+":"+translation);
    }
    public String translate(String word){
        for (String s : this.dictionary){
            if(s.contains(word)){
                String[] record = s.split(":");
                if(record[0].equals(word))
                    return record[1];
                if(record[1].equals(word)){
                    return record[0];
                }
            }
        }
        return null;
    }

    public void delete(String word){
        String toRemove = "";
        for(String s : this.dictionary){
            if(s.contains(word))
                toRemove = s;
        }
        if(!toRemove.isEmpty()){
            this.dictionary.remove(toRemove);
        }
    }

    public boolean load(){
        try(Scanner scanner = new Scanner(Paths.get(this.file))){
            while(scanner.hasNextLine()){
                this.dictionary.add(scanner.nextLine());
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter fileWriter = new FileWriter(this.file);
            for (String s:this.dictionary){
                fileWriter.write(s+"\n");
            }
            fileWriter.close();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
