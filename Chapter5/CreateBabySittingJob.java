import java.util.Scanner;

class CreateBabySittingJob{

    public static Scanner input = new Scanner(System.in);
  public static void main(String Args[])
  {
      BabySittingJob job1 = new BabySittingJob();
      job1 = init(job1);
      job1.display();
  }

  public static BabySittingJob init(BabySittingJob bJob) {
    short year;
    short jobNumber;
    byte babySitterCode;
    byte numberOfChildren;
    byte numberOfHours;

    do {
        System.out.print("Enter a year between 2013-2025: ");
        year = input.nextShort();
    } while (year < 2013 || year > 2025);
    

    do {
        System.out.print("Enter a job number between 1-9999: ");
        jobNumber = input.nextShort();
    } while (jobNumber < 1 || jobNumber > 9999);

    do {
        System.out.print("Enter a babisitter's code (1 Cindy| 2 Greg| 3 Marcia): ");
        babySitterCode = input.nextByte();
        
    } while (babySitterCode < 1 || babySitterCode > 3);

    do {
        System.out.print("Enter the number of children to babysit(1..9): ");
        numberOfChildren = input.nextByte();

    } while (numberOfChildren < 1 || numberOfChildren > 9);

    do {
        System.out.print("Enter the number of hours to babysit: ");
        numberOfHours = input.nextByte();
    } while (numberOfHours < 1 || numberOfHours > 12);

    bJob = new BabySittingJob(Integer.parseInt(Short.toString(year).substring(Short.toString(year).length()-2, 
                                                    Short.toString(year).length()) + jobNumber), 
                                                        babySitterCode, 
                                                            numberOfChildren, 
                                                                numberOfHours);
    return bJob;
  }
}