import javax.security.auth.Subject;

public class Main {
    Subject subject = new Subject();

    public static void mainMenu() {
        System.out.println("Welcome to the Attendance Tracker!");
        System.out.println("1. Log in");
        System.out.println("2. Sign up");
        System.out.println("3. Exit");
    }

    public static void logIn() {
        System.out.println("Log in");
        System.out.println("Enter your username: ");
        System.out.println("Enter your password: ");
    }

    public static void signUp() {
        System.out.println("Sign up");
        System.out.println("Enter your username: ");
        System.out.println("Enter your password: ");
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
}
    