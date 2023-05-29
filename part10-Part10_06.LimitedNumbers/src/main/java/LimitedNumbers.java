
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input<0){
                break;
            }
            numbers.add(input);
        }

        numbers.stream()
                .filter(input -> input > 0 && input < 6)
                .forEach(input -> System.out.println(input));
    }
}
