// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
public class Truck extends Vehicle {
    private double maxLoad;

    public Truck() {
        this.maxLoad = 10000; 
    }
    public Truck(double maxLoad) {
        this.maxLoad = maxLoad; // Placeholder value
    }

    @Override
    public String toString() {
        return "Truck adalah angkutan darat yang sangat handal";
    }

    @Override
    double calcFuelEfficiency() {
        return maxLoad * 0.5; // Placeholder calculation
    }

    @Override
    double calcTripDistance() {
        return maxLoad * 100; // Placeholder calculation
    }
}
