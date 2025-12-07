package pert7;

public class PaymentTest {

    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // Membuat objek EWalletPayment
        EWalletPayment payment = new EWalletPayment("OVO", 150000, 50000);

        // Menampilkan saldo awal
        System.out.println("Saldo awal: " + payment.getBalance());

        // Memproses pembayaran
        System.out.println("Memproses pembayaran sebesar " + payment.getPaymentAmount() + "...");
        String result = payment.processPayment();
        System.out.println(result);

        // Menampilkan sisa saldo
        System.out.println("Sisa saldo: " + payment.getBalance());

        // Menampilkan detail transaksi
        System.out.println("Detail Transaksi: " + payment.getPaymentDetails());
    }
}
