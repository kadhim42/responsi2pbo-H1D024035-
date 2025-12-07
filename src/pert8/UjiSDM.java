package pert8;

public class UjiSDM {
    public static void main(String[] args) {
        // ==========================================================
        // DATA UJI COBA
        // ==========================================================
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. PENGUJIAN METODE BERURUTAN
        andi.hitungGaji(160);               // Hitung gaji
        System.out.println("Status Cuti: " + andi.getStatusCuti()); // Status cuti
        andi.login("9999");                  // Tes PIN salah
        andi.login("1234");                  // Tes PIN benar
        System.out.println("Role akses: " + andi.getRoleAkses());  // Role akses
        andi.perpanjangKontrak(6);           // Perpanjang kontrak
        andi.logout();                        // Logout
    }
}

