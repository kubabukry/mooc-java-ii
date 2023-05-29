
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int sum = 0;
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0){
                break;
            }
            if(input > 0){
                positive++;
                sum+=input;
            }

        }
        if(positive==0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0*sum/positive;
            System.out.println(average);
        }
    }
}
