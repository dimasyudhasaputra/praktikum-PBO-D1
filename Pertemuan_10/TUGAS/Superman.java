// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
public class Superman extends Kryptonian implements IFlyer {
    String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void takeOff() {
        System.out.println(name + " take-off");
    }

    @Override
    public void land() {
        System.out.println(name + " land");
    }

    @Override
    public void fly() {
        System.out.println(name + " fly");
    }

    @Override
    void eat() {
        System.out.println(name + " eat");
    }

    void leapBuilding() {
        System.out.println(name + " leapBuilding");
    }

    void stopBullet() {
        System.out.println(name + " stopBullet");
    }
}
