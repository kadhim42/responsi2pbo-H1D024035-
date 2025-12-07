package pert4;

public class UjiCustomer {
	public static void main(String[] args) {
        // Membuat object Customer
        Customer cust1 = new Customer("Budi Santoso", "CST-001", 500000);

        // Membuat object Member
        Member member1 = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // Tampilkan info Customer biasa
        System.out.println("Status: Customer Biasa");
        cust1.tampilkanInfo();
        System.out.println();

        // Tampilkan info Member
        System.out.println("Status: Member");
        member1.tampilkanInfo();
    }
}
