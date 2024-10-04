import java.util.Scanner;

public class Tugas3jobsheet6Ke1 {   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;
        int terbesar;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkkan bilangan kedua: ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
            } else terbesar = bil3;
        } else if (bil2 > bil1) {
            if (bil2 > bil3) {
                terbesar = bil2;
            } else terbesar = bil3;
        } else terbesar = bil3;
        System.out.println("Bilangan terbesar: " + terbesar);
    }
}
