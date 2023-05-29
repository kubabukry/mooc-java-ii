package FlightControl.ui;

import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class TextUI {
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(){
        this.flightControl = new FlightControl();
        this.scanner = new Scanner(System.in);
    }

    public void startAssetControl(){
        String input = "";
        while(true){
            System.out.println("Choose an action: ");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");

            input = this.scanner.nextLine();
            if(input.equals("X")||input.equals("x")){
                break;
            }
            if(input.equals("1")){
                System.out.print("Give the airplane id: ");
                String id = this.scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(this.scanner.nextLine());
                this.flightControl.addAirplane(id, capacity);
                continue;
            }
            if(input.equals("2")){
                System.out.print("Give the airplane id: ");
                String id = this.scanner.nextLine();
                System.out.print("Give the departure airport id: ");
                String departureID = this.scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String targetID = this.scanner.nextLine();
                this.flightControl.addFlight(this.flightControl.getAirplane(id), departureID, targetID);
            }
        }

    }

}
