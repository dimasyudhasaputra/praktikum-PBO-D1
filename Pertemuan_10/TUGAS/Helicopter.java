// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter() {
        this.maxLoad = 3000; 
    }

    @Override
    public double calcFuelEfficiency() {
        return maxLoad / 9; 
    }

    @Override
    public double calcTripDistance() {
        return maxLoad / 4; 
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter takes off");
    }

    @Override
    public void land() {
        System.out.println("Helicopter lands");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter flies");
    }

    @Override
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}