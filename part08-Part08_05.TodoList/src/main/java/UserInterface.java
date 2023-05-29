import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = this.scanner.nextLine();

            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.println("To add: ");
                String input = this.scanner.nextLine();
                this.todoList.add(input);
            }
            if(command.equals("list")){
                this.todoList.print();
            }
            if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int input = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(input);
            }
        }
    }
}
