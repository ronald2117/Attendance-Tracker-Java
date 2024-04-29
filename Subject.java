import java.util.ArrayList;
import java.util.HashMap;

public class Subject {
    String name;
    ClassTime time;
    String teacher;
    String room;
    String section;
    String subjectCode;
    ArrayList<Student> students;
    HashMap<Date, ArrayList<Attendance>> attendance;
}
