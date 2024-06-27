package IBS;

public class Motobike {
    private int years;
   private String color;
    private String model;

    public int getYears() {
        return years;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
    Motobike(int yearsMotobike, String colorMotobike, String modelMotobike){
        years = yearsMotobike;
        color = colorMotobike;
        model = modelMotobike;

    }
    public void info(){
        System.out.println("It is bike");
    }

    public int yearDifference(int year){
        int raz = year - years;
return raz;
    }
}
