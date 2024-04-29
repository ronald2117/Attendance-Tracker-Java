public class Student{
    private int classId;
    private String schoolId;
    private String name;

    public Student(int classId, String schoolId, String name) {
        this.classId = classId;
        this.schoolId = schoolId;
        this.name = name;
    }

    public int getClassId() {
        return classId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public String getName() {
        return name;
    }
}
