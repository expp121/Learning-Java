/**
 * Student
 */
public class Student {
    String id;
    float numberCreditHours;
    short numberPointsEarned;
    float gradePointAvg;
    
    Student()
    {
        id="9999";
        numberPointsEarned=12;
        numberCreditHours=3;
        System.out.print("\nID set to 9999\nPoints Earned are set to 12\nNumber of Credit hours is to 3");
    }
    public void setId(String Id) {this.id=Id;}
    public void setNumberCreditHours(float creditHours) {numberCreditHours=creditHours;}
    public void setPointsEarned(short earnedPoints) {numberPointsEarned=earnedPoints;}
    public void computeGradeAVG(){ gradePointAvg=numberPointsEarned/numberCreditHours;}
    
    public String getId() {return id;}
    public float getNumberCreditHours(){return numberCreditHours;}
    public float getNumberPointsEarned(){return numberPointsEarned;} 
    public float getGradePointAvg(){return gradePointAvg;}



} 