package pert4;

public class Member extends Customer{
	int poinReward;
    String levelKeanggotaan;

    // Constructor dengan super
    Member(String nama, String idCustomer, int totalBelanja, int poinReward, String levelKeanggotaan) {
        super(nama, idCustomer, totalBelanja); // panggil constructor parent
        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }

    // Overriding method untuk menampilkan info
    @Override
    void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info dasar dari Customer
        System.out.println("Poin Reward: " + poinReward + " | Level: " + levelKeanggotaan);
    }
}
