import java.util.Scanner;
public class Tugas3Jobsheet6ke2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        float diskon = 0 / 100f, totalDiskon;

        System.out.print("Masukkan Jenis Buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku yag dibeli: ");
        jumlahBuku =  sc.nextInt();


        switch (jenisBuku.toLowerCase()) {
            case "kamus":
                diskon = 10;
                if (jumlahBuku > 2) {
                    diskon += 2;
                }
                break;
                case "novel":
                diskon = 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                } else {
                    diskon += 1;
                }
                break;
                default:
                if (jumlahBuku > 3) {
                    diskon = 5;
                }
                break;
                }
                totalDiskon = diskon;
                System.out.println("Diskon yang didapat:" + totalDiskon + "%");
    }
    
}
