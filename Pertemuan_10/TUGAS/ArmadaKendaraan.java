// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArmadaKendaraan {
    private List<Vehicle> armada = new ArrayList<>();

    public void tambahArmada(Collection<? extends Vehicle> kendaraan) {
        armada.addAll(kendaraan);
    }

    public List<Vehicle> getAllArmada() {
        return new ArrayList<>(armada);
    }
}
