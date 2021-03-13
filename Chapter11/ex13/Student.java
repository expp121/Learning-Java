package students;

public abstract class Student {

    private String name;
    private boolean fullTime;
    private float tuitionFee;

    public Student(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }

    public String getName() {
        return this.name;
    }
    public float getTuitionFee() {
        return this.tuitionFee;
    }

    public boolean isFullTime() {
        return this.fullTime;
    }

    protected void setTuitionFee(float fee) {
        this.tuitionFee = fee;
    }

    public abstract void determineTuition();
    public abstract void display();

}