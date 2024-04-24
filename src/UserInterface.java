import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);
    private String name = "the name of the scanner";
    private String[] commands = {};

    // getters and setters
    public String getName() {
        return name;
    }

    public String getCommands(int input) {
        return commands[input];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

//    public void printGreetings() {
//        System.out.println("Welcome " + this.name);
//    }

    public void printCommands() {
        if (this.commands.length == 0) {
            System.out.println("No current commands set");
        } else {
            System.out.print("Please select an option");
            for (int i = 0; i < commands.length; i++) {
                System.out.print(" " + i + " " + commands[i]);
            }
        }
    }

    public String getStringInput() {
        return scanner.nextLine();
    }

//    public int getIntegerInput() {
//        return scanner.nextInt();
//    }
//
//
//    public String getStringInput(int input) {
//        return String.valueOf(input);
//    }
}
