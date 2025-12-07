package pert6;

public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE
    // ==========================================================
    private String namaKendaraan;
    private int levelEnergi;          // 0–100
    private int kapasitasPenumpang;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }

    // ==========================================================
    // GETTER
    // ==========================================================
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    protected void setLevelEnergi(int levelEnergi) {
        this.levelEnergi = Math.min(Math.max(levelEnergi, 0), 100);
    }

    // ==========================================================
    // METHOD BIASA
    // ==========================================================
    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    // ==========================================================
    // ABSTRACT METHOD
    // ==========================================================
    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);
}
