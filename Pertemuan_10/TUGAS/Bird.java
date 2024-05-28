// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
public class Bird extends Animal implements IFlyer {
    @Override
    public void takeOff() {
        System.out.println("Bird takes off");
    }

    @Override
    public void land() {
        System.out.println("Bird lands");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies");
    }

    public void buildNest() {
        System.out.println("Bird builds a nest");
    }

    public void layEggs() {
        System.out.println("Bird lays eggs");
    }

    @Override
    public void eat() {
        System.out.println("Bird eats");
    }
}