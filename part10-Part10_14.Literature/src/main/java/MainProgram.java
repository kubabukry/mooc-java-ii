
import java.util.*;
import java.util.stream.Collectors;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();


        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));
        }

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println(books.size()+" books in total.");
        System.out.println("");
        System.out.println("Books: ");
        for(Book book : books){
            System.out.println(book);
        }
    }

}
