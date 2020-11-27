public class LabCourse extends CollegeCourse2 {
    
    public LabCourse(String department, int courseNumber, short credits) {
        super(department, courseNumber, credits);
        super.setCourseFee(super.getCourseFee() + 50.0f);
    }

    @Override
    public void display(){
        System.out.println("LAB COURSE");
        super.display();
    }
}