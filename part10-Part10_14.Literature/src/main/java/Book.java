public class Book {
    private String name;
    private int age;

    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return this.getName()+" (recommended for "+this.getAge()+" year-olds or older)";
    }
}
