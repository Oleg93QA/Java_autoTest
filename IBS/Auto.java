package IBS;

public class Auto {
    private int years;
    private String color;
    private String model;

    public int getYears() {
        return years;
    }
    public void setYears(int years){
        this.years = years;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void info(){
        System.out.println("It is auto");
    }
    public int yearDifference(int year){
        int raz = Math.abs(year - years);
        return raz;
    }
}