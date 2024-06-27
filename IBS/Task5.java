package IBS;

public class Task5 {
    public static void main(String[] args) {
      //  Auto reno = new Auto();
        //reno.setColor("black");
        //reno.setModel("N23");
        //reno.setYears(2023);
       // System.out.println(reno.getModel() + reno.getColor() + reno.getYears());

   //     Motobike moto = new Motobike(1995,"white","45tuu");
  //      System.out.println(moto.getModel() + moto.getColor() + moto.getYears());

        Airplane air = new Airplane("boing", 1995,120,546);
        air.fillUp(60);
        air.fillUp(5);
        air.info();

    }
}
