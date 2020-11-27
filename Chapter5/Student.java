public class Student {

    private short studentIdNumber;

    private CollegeCourse[] courses = new CollegeCourse[5];

    public void setStudentIdNumber(short idNumber) {
        this.studentIdNumber = idNumber;
    }

    public void setCollegeCourse(CollegeCourse course, int index) {
        this.courses[index] = new CollegeCourse();
        this.courses[index].setClassId(course.getClassId());
        this.courses[index].setCreditHours(course.getCreditHours());
        this.courses[index].setGrade(course.getGrade());
    }

    public short getStudentIdNumber() {
        return this.studentIdNumber;
    }

    public CollegeCourse getCourse(int index) {

        return this.courses[index];
    }

}
