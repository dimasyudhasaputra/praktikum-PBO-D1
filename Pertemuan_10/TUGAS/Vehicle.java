// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
public abstract class Vehicle {
    abstract double calcFuelEfficiency();
    abstract double calcTripDistance();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
