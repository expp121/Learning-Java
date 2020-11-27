public class Horse{

    private String name;
    private String color;
    private int birthYear;

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public int getBirthYear(){
        return this.birthYear;
    }
}