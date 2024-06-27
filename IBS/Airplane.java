package IBS;

public class Airplane {
  private String  producer;
private int year ;
 private int length;
 private int weight;
 private int fuel;


    public int getFuel() {
        return fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println(producer +  "\n-год выпуска:"  + year + "\n-длина:"+ length+
                "\n-вес:" + weight+ "\n-количество топлива в баке:" + fuel);
    }

    public void fillUp(int litr){
        fuel+=litr;
        System.out.println("litrov v bake" + litr);


    }
}
