public class CollegeCourse2 {
    private String department;
    private int courseNumber;
    private short credits;
    private float courseFee;

    public CollegeCourse2(String department, int courseNumber, short credits){
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.courseFee = credits * 120.0f;

    }

    protected float getCourseFee(){
        return this.courseFee;
    }

    protected void setCourseFee(float courseFee){
        this.courseFee = courseFee;
    }

    public void display(){
        System.out.println("\nDepartment: " + this.department 
        + "\nCourse Number: " + this.courseNumber 
        + "\nCredits: " + this.credits
        + "\nCourse Fee: " + this.courseFee + "$");

    }
}