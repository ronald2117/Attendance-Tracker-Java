import javax.security.auth.Subject;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<User> users = new ArrayList<User>();
    static User currentUser;
    static Subject subject = new Subject();
    static Scanner scanner = new Scanner(System.in);

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void mainMenu() {
        clearConsole();
        System.out.println("Welcome to the Attendance Tracker!");
        System.out.println("1. Log in");
        System.out.println("2. Sign up");
        System.out.println("3. Exit");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                logIn();
                break;
            case 2:
                signUp();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                mainMenu();
        }

    }

    public static void logIn() {
        clearConsole();
        System.out.println("Log in");
        System.out.print("Enter your username: ");
        String userName = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();

        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                Menu();
            }
        }

        reLogin();
    }

    public static void reLogin() {
        System.out.println("Invalid username or password");
        System.out.println("1. Try again");
        System.out.println("2. Back to main menu");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                logIn();
                break;
            case 2:
                mainMenu();
                break;
            default:
                System.out.println("Invalid choice");
                reLogin();
        }
    }

    public static void signUp() {
        clearConsole();
        System.out.println("Sign up");
        System.out.print("Enter your username: ");
        String userName = scanner.next();
        System.out.print("Enter your password: ");
        String password = scanner.next();

        users.add(new User(userName, password));


    }

    public static void Menu() {
        System.out.println("Menu");
        System.out.println("1. Attendance");
        System.out.println("2. Subjects");
        System.out.println("3. Students");
        System.out.println("4. Log out");
    }

    public static void Attendance() {
        System.out.println("Attendance");
        System.out.println("1. Add attendance");
        System.out.println("2. View attendance");
        System.out.println("3. Update attendance");
        System.out.println("4. Delete attendance");
        System.out.println("5. Back");
    }

    public static void Subjects() {
        System.out.println("Subjects");
        System.out.println("1. Add subject");
        System.out.println("2. View subjects");
        System.out.println("3. Update subject");
        System.out.println("4. Delete subject");
        System.out.println("5. Back");
    }

    public static void Students() {
        System.out.println("Students");
        System.out.println("1. Add student");
        System.out.println("2. View students");
        System.out.println("3. Update student");
        System.out.println("4. Delete student");
        System.out.println("5. Back");
    }

    public static void addAttendance() {
        System.out.println("Add attendance");
        System.out.println("Enter the date: ");

    }

    public static void main(String[] args) {
        mainMenu();
    }
}
    