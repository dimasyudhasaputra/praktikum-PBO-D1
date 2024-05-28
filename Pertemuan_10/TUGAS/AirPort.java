// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return name + " grants landing permission to " + flyer;
        } else {
            return name + " denies landing permission to " + flyer;
        }
    }
}
