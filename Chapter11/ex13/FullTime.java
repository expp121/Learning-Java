package students;

public class FullTime extends Student {

    public FullTime(String name, boolean fullTime) {
        super(name, fullTime);
        this.determineTuition();
    }

    @Override
    public void determineTuition() {
        super.setTuitionFee(2000.0f);
    }

    @Override
    public void display() {
        System.out.println("\nName: " + super.getName() + "\nFull-Time: " + super.isFullTime() + "\nFee: "
                + super.getTuitionFee());
    }

}
