import java.util.ArrayList;
import java.util.HashMap;

public class Subject {
    private String name;
    private ClassTime time;
    private String teacher;
    private String room;
    private String section;
    private String subjectCode;
    private ArrayList<Student> students;
    private HashMap<Date, ArrayList<Attendance>> attendance;

    public Subject(String name, ClassTime time, String teacher, String room, String section, String subjectCode) {
        this.name = name;
        this.time = time;
        this.teacher = teacher;
        this.room = room;
        this.section = section;
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public ClassTime getTime() {
        return time;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getRoom() {
        return room;
    }

    public String getSection() {
        return section;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public HashMap<Date, ArrayList<Attendance>> getAttendance() {
        return attendance;
    }

    public void addAttendance(Date date, ArrayList<Attendance> attendanceList) {
        attendance.put(date, attendanceList);
    }
}
