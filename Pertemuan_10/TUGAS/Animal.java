// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
public abstract class Animal {
    abstract void eat();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
