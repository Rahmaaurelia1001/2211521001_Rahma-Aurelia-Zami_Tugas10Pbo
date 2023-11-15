import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);


        // Polimorfisme
        Member customer1 = new MemberRegular();
        Member customer2 = new MemberSilver();
        Member customer3 = new MemberGold();
        Member customer4 = new MemberPlatinum();

        MemberSilver silverMember = new MemberSilver();
        MemberGold goldMember = new MemberGold();
        MemberPlatinum platinumMember = new MemberPlatinum();

        // Member Reguler
        System.out.print("Masukkan total belanja Member Reguler: Rp.");
        int totalregular1 = scanner.nextInt();
        int totalBayar1 = customer1.hitungTotalBayar(totalregular1);
        System.out.println("Total bayar Member Reguler: Rp. " + totalBayar1);

        // Member Silver
        System.out.print("Masukkan total belanja Member Silver: Rp.");
        int totalsilver1 = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Silver:  ");
        Double jarak2 = scanner.nextDouble();
        int totalBayar2 = customer2.hitungTotalBayar(totalsilver1);
        double jarakTujuan2 = silverMember.hitungOngkir(jarak2);
        System.out.println("Total bayar Member Silver: Rp. " + totalBayar2);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuan2);

        // Member Gold
        System.out.print("Masukkan total belanja Member Gold: ");
        int totalmembergold = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Gold: ");
        Double jarak3 = scanner.nextDouble();
        int totalBayar3 = customer3.hitungTotalBayar(totalmembergold);
        double jarakTujuan3 = goldMember.hitungOngkir(jarak3);
        double cicilan3 = totalBayar3 /12;
        System.out.println("Total bayar Member Gold: Rp." + totalBayar3);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuan3);
        System.out.println("Cicilan Per Bulan: Rp. " + cicilan3 + "/bulan");

        // Member Platinum
        System.out.print("Masukkan total belanja Member Platinum:Rp. ");
        int totalmemberPlatinum = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Platinum: ");
        Double jarak4 = scanner.nextDouble();
        int totalBayar4 = customer4.hitungTotalBayar(totalmemberPlatinum);
        double jarakTujuan4 = platinumMember.hitungOngkir(jarak4);
        double cicilan4 = totalBayar4 /12;
        System.out.print("Masukkan jumlah deposit untuk Member Platinum: Rp. ");
        int depositPlatinum = scanner.nextInt();
        int saldoPlatinum = platinumMember.deposit(depositPlatinum);
        System.out.println("Total bayar Member Platinum:Rp. " + totalBayar4);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuan4);
        System.out.println("Cicilan Per Bulan: Rp. " + cicilan4 + "/bulan");
        System.out.println("Saldo Member Platinum setelah deposit:Rp. " + saldoPlatinum);

        
        scanner.close();

}
}


