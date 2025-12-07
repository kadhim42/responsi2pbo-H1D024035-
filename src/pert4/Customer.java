package pert4;

public class Customer {
	String nama;
    String idCustomer;
    int totalBelanja;

    // Constructor
    Customer(String nama, String idCustomer, int totalBelanja) {
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    // Method untuk menampilkan info
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + idCustomer + " | Total Belanja: Rp " + totalBelanja);
    }
}
