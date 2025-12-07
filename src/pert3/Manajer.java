package pert3;

class Manajer extends Karyawan {
    private double tunjangan;

    // Constructor (pakai super)
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);   // Memanggil constructor parent
        this.tunjangan = tunjangan;
    }

    // Override method tampilInfo
    @Override
    void tampilInfo() {
        double total = gajiPokok + tunjangan;

        System.out.println("Nama: " + nama
                + " | Gaji Pokok: Rp " + gajiPokok
                + " | Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + total);
    }
        
    }
