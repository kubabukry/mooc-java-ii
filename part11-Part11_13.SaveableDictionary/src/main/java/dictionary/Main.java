package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary s = new SaveableDictionary("word-5581.txt");
        s.load();
        s.delete("below");
        s.add("tieokone", "computer");
        System.out.println(s.save());
    }
}
