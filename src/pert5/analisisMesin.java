package pert5;

import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] daftarMesin = new defaultMesin[5];

        daftarMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftarMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        daftarMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        daftarMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftarMesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : daftarMesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : daftarMesin) {
            if (m instanceof mesinMotor) {
                ((mesinMotor)m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik)m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor)m).suaraMesin();
            }
        }

        // Mesin performa tertinggi
        defaultMesin mesinTerbaik = daftarMesin[0];
        for (defaultMesin m : daftarMesin) {
            if (m.nilaiPerforma() > mesinTerbaik.nilaiPerforma()) {
                mesinTerbaik = m;
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.println(mesinTerbaik.namaMesin + " → " + mesinTerbaik.nilaiPerforma());

        // Top 3 mesin terbaik (descending)
        Arrays.sort(daftarMesin, new Comparator<defaultMesin>() {
            @Override
            public int compare(defaultMesin m1, defaultMesin m2) {
                return Double.compare(m2.nilaiPerforma(), m1.nilaiPerforma());
            }
        });

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + daftarMesin[i].namaMesin + " → " + daftarMesin[i].nilaiPerforma());
        }
    }
}