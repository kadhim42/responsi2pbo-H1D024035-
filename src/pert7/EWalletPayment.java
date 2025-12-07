package pert7;

public class EWalletPayment implements PaymentMethod {

    private String walletName;
    private double paymentAmount;
    private double balance;

    // Constructor
    public EWalletPayment(String walletName, double balance, double paymentAmount) {
        this.walletName = walletName;
        this.balance = balance;
        this.paymentAmount = paymentAmount;
    }

    // Getter untuk paymentAmount
    public double getPaymentAmount() {
        return paymentAmount;
    }

    // Implementasi processPayment
    @Override
    public String processPayment() {
        double totalAmount = paymentAmount + getTransactionFee();
        if (balance >= totalAmount) {
            balance -= totalAmount;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    // Implementasi getPaymentDetails
    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + walletName;
    }

    // Implementasi getTransactionFee
    @Override
    public double getTransactionFee() {
        return 2000; // biaya transaksi tetap
    }

    // Implementasi getBalance
    @Override
    public double getBalance() {
        return balance;
    }
}
