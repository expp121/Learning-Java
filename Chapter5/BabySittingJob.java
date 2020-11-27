
/**
 * BabySittingJob
 */
public class BabySittingJob {

    private int jobNumber;
    private byte babySitterCode;
    private String name;
    private byte childrenToWatch;
    private short numberOfJobHours;
    private short fee = 0;
    
    public int getJobNumber() {
        return jobNumber;
    }

    public byte getBabySitterCode() {
        return babySitterCode;
    }

    public byte getChildrenToWatch() {
        return childrenToWatch;
    }

    public short getNumberOfJobHours() {
        return numberOfJobHours;
    }

    public short getFee() {
        return fee;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public BabySittingJob(){}

    public BabySittingJob(int jobNumber, byte babySitterCode, byte childrenToWatch, short numberOfJobHours) {

        this.jobNumber = jobNumber;
        this.babySitterCode = babySitterCode;
        this.childrenToWatch = childrenToWatch;
        this.numberOfJobHours = numberOfJobHours;
        
        switch (babySitterCode) {
            case 1:
                setName("Cindy");
                this.fee = (short)(childrenToWatch * numberOfJobHours * 7);
            break;
        
            case 2:
                setName("Greg");
                if (childrenToWatch > 1 && numberOfJobHours > 0)
                    this.fee = (short)((9 * numberOfJobHours) + (4 * (childrenToWatch-1) * numberOfJobHours));
            break;

            case 3:
                setName("Marcia");
                this.fee = (short)((9 * numberOfJobHours) + (4 * (childrenToWatch-1) * numberOfJobHours));
            break;

            default:
                System.out.println("Invalid babysitter number.");
            break;

        }
    }

    public void display(){
        System.out.println("\nJob Number: " + getJobNumber() + 
                            "\nBabysitter's code: " + getBabySitterCode() + 
                            "\nBabysitter's Name: " + getName() + 
                            "\nChildren to babysit: " + getChildrenToWatch() + 
                            "\nNumber of hours to babysit: " + getNumberOfJobHours() + 
                            "\nFee: " + getFee() + "$\n");
    }
}
