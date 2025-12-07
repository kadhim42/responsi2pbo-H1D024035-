package pert2;

public class Barangmusik {
	String kode;
    String nama;
    double harga;
    int stok;

    // Constructor kode dan nama
    Barangmusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
        this.stok = 0;
    }

    // Constructor kode, nama, harga
    Barangmusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor data lengkap
    Barangmusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    void tampilInfo() {
        System.out.println(
            "Alat musik " + this.nama +
            " | Kode: " + this.kode +
            " | Harga: Rp " + this.harga +
            " | Stok: " + this.stok + " unit"
        );
    }
}
