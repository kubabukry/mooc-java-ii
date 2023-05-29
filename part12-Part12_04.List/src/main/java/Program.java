import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> myList = new List<>();
        myList.add("elo");
        System.out.println(myList.contains("elo"));
        System.out.println(myList.contains("bajojajo"));
        myList.remove("elo");
        System.out.println(myList.contains("elo"));
    }

}
