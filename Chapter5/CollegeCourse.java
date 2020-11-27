public class CollegeCourse {
    private String classId;
    private short creditHours;
    private char grade;

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setCreditHours(short creditHours) {
        this.creditHours = creditHours;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getClassId() {
        return classId;
    }

    public short getCreditHours() {
        return creditHours;
    }

    public char getGrade() {
        return grade;
    }
}