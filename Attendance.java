package AttendanceTracker;

public class Attendance {
    private Student student;
    private Boolean isPresent;

    public Attendance(Student student, Boolean isPresent) {
        this.student = student;
        this.isPresent = isPresent;
    }

    public Student getStudent() {
        return student;
    }

    public Boolean getIsPresent() {
        return isPresent;
    }
}
