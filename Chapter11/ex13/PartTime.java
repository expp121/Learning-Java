package students;

public class PartTime extends Student {

    public PartTime(String name, boolean fullTime) {
        super(name, fullTime);
        this.determineTuition();
    }

    @Override
    public void determineTuition() {
        super.setTuitionFee(200.0f);
    }

    @Override
    public void display() {
        System.out.println("\nName: " + super.getName() + "\nFull-Time: " + super.isFullTime() + "\nFee: "
                + super.getTuitionFee() + "$ per hour");

    }

}
