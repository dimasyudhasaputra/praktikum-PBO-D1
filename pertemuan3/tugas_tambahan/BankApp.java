// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1
//package pertemuan3.tugas_tambahan;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        System.out.println("\nSaldo saat ini: $" + account.getBalance() + "\n");
        account.deposit(900.0);
        System.out.println("Saldo saat ini: $" + account.getBalance() + "\n");

        try {
            account.withdraw(300.0);
            account.withdraw(200);
            account.withdraw(700);
        } catch (InsufficientFundsException a) {
            System.out.println("Saldo saat ini: $" + account.getBalance());
            System.out.println(a.getMessage());

        }

    }
}