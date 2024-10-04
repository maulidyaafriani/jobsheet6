import java.util.Scanner;

public class pertanyaan4percobaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan_menu;
        String member, pembayaran;
        double diskon = 0.0, harga = 0.0, total_bayar;
        int potongan_qris = 1000; 

        System.out.println("-----------------");
        System.out.println("=========== MENU CAFE JTI =========");
        System.out.println("-----------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        pilihan_menu = sc.nextInt();
        sc.nextLine();  
        System.out.print("Apakah punya member (y/n)? ");
        member = sc.nextLine();
        System.out.print("Apakah pembayaran menggunakan QRIS (y/n)? ");
        pembayaran = sc.nextLine();
        System.out.println("---------------------------------------");

        if (member.equalsIgnoreCase("y")) { 
            diskon = 0.10; 
            System.out.println("Besar diskon = 10%");

            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling (Ricebowl + Ice Tea) = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; 
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        } else if (member.equalsIgnoreCase("n")) { 
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling (Ricebowl + Ice Tea) = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);

        } else {
            System.out.println("Status member tidak valid.");
            return;
        }
        if (pembayaran.equalsIgnoreCase("y")) {
            total_bayar -= potongan_qris;
            System.out.println("Anda mendapat potongan Rp.1000 karena menggunakan QRIS");
        }

        // System.out.println("Total bayar akhir = " + total_bayar);
        System.out.println("----------------------------------------");
    }
}