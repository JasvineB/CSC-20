import java.util.Calendar;

public class Car {
    private String color,model;
    private int year;

    public Car() {
        this.color = this.model = "";
        this.year = -1;
    }

    public Car(String model, String color, int year) {
        this.model=model;
        this.color=color;
        this.year=year;
    }

    public String getColor() { return this.color; }

    public String getModel() { return this.model; }

    public int getYear() { return this.year; }

    public void setColor(String color) { this.color=color; }

    public void setModel(String model) { this.model=model; }

    public void setYear(int year) { this.year=year; }

    public String ageOfCar() {
        Calendar cal = Calendar.getInstance();
        int ageOfCar = cal.get(Calendar.YEAR) - this.year;
        return "This car is "+ageOfCar+" years old.";
    }

    public String toString() {
        return "Model: "+this.model+" Color: "+this.color+" Year: "+this.year;
    }
}