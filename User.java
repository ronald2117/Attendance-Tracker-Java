import java.util.ArrayList;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String userName;
    private String password;
    private ArrayList<Subject> subjects;

    public User(String firstName, String middleName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}
