package pert7;

public interface PaymentMethod {

    // Memproses transaksi pembayaran
    String processPayment();

    // Mengembalikan detail transaksi
    String getPaymentDetails();

    // Mengembalikan biaya transaksi (misal tetap Rp 2.000)
    double getTransactionFee();

    // Mengembalikan saldo saat ini
    double getBalance();
}
