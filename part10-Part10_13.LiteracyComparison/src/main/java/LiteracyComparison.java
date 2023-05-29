
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        String file = "literacy.csv";
        ArrayList<String> lines = new ArrayList<>();

        try(Scanner scanner= new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        lines.stream()
                .map(line -> line.split(","))
                .sorted(Comparator.comparing(line -> line[5]))
                .forEach(line -> System.out.println(line[3]+" ("+line[4]+"), "+line[2].split(" ")[1].trim()+", "+line[5]));

    }
}
