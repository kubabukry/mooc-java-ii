
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Packable book1 = new Book("Nicze", "O dziurze", 0.8);
        Packable book2 = new Book("Gibek", "Hydrologia dla zielonych", 1.0);

        Packable cd1 = new CD("Nirvana", "Nevermind", 1992);
        Packable cd2 = new CD("Nirvana", "In Utero", 1994);

        Box smallBox = new Box(2.0);
        Box bigBox = new Box(10.0);

        smallBox.add(cd1);
        smallBox.add(cd2);
        bigBox.add(book1);
        bigBox.add(book2);
        bigBox.add(smallBox);

        System.out.println(smallBox);
        System.out.println(bigBox);
    }

}
