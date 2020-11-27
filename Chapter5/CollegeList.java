import java.util.Scanner;

public class CollegeList {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CollegeEmployee[] collegeEmployees = new CollegeEmployee[4];
        Faculty[] faculties = new Faculty[3];
        Student2[] students = new Student2[7];
        byte collegeEmployeesEntered = 0, facultiesEntered = 0, studentsEntered = 0;
        char studentType;

        allLoops:
        while (true) {
            System.out.print("Which type of person do you want to enter(C,F,S or Q(to quit) )\n:");
            studentType = input.nextLine().charAt(0);
            switch (studentType) {
                case 'C':

                    if(collegeEmployeesEntered < 4){
                        collegeEmployees[collegeEmployeesEntered] = new CollegeEmployee();
                        collegeEmployees[collegeEmployeesEntered].initialize();
                        collegeEmployeesEntered++;
                    }
                    else System.out.println("You've entered the max amount for college employees");
                
                break;
                    
                case 'F':
                
                    if(facultiesEntered < 3){
                        faculties[facultiesEntered] = new Faculty();
                        faculties[facultiesEntered].initialize();
                        facultiesEntered++;
                    }
                    else System.out.println("You've entered the max amount for faculties");
                
                break;
                
                case 'S':

                    if(studentsEntered < 7){
                        students[studentsEntered] = new Student2();
                        students[studentsEntered].initialize();
                        studentsEntered++;
                    }
                    else System.out.println("You've entered the max amount for students");
                    
                break;
            
                case 'Q':
                break allLoops;
            
                default:
                    break;
            }
        }
        
        System.out.println("COLLEGE EMPLOYEES\n==================");
        if (collegeEmployeesEntered == 0)
            System.out.println("NONE");
        else for (int i = 0; i < collegeEmployeesEntered; i++)
            collegeEmployees[i].display();

        System.out.println();
        
        System.out.println("FACULTIES\n==================");
        if (facultiesEntered == 0)
            System.out.println("NONE");
        else for (int i = 0; i < facultiesEntered; i++)
            faculties[i].display();
        System.out.println();

        System.out.println("STUDENTS\n==================");
        if (studentsEntered == 0) 
            System.out.println("NONE");
        else for (int i = 0; i < studentsEntered; i++)
            students[i].display();
    }
}