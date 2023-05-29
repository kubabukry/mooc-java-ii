public class Student extends Person{
    private int points;

    public Student(String name, String address) {
        super(name, address);
    }

    public int credits(){
        return this.points;
    }
    public void study(){
        this.points++;
    }

    public String toString(){
        return super.toString()+"\n"+"  Study credits "+this.credits();
    }
}
