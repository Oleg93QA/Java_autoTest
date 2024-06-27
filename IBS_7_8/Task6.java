package IBS_7_8;

public class Task6 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boing",1991, 237,7890);
        Airplane airplane2 =new Airplane("Suhoi",2005,123,236);
        plane.info();
        Airplane.compareAirplanes(plane,airplane2);
    }
}
