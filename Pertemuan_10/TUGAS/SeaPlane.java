// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
public class SeaPlane extends Airplane {
    private double maxLoad;
    
    public SeaPlane() {
        this.maxLoad = 5000; // Placeholder value
    }

    @Override
    double calcFuelEfficiency() {
        return maxLoad * 0.3; // Placeholder calculation
    }

    @Override
    double calcTripDistance() {
        return maxLoad * 200; // Placeholder calculation
    }
    @Override
    public void takeOff() {
        System.out.println("SeaPlane takes off");
    }

    @Override
    public void land() {
        System.out.println("SeaPlane lands");
    }

    @Override
    public void fly() {
        System.out.println("SeaPlane flies");
    }

    @Override
    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
