import java.util.Scanner;
public class TugasSatu12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalHarga = 0;
        double diskon = 0;
        int totalBayar;

        System.out.print("Masukkan jumlah tiket yang ingin dibeli (ketik 0 untuk keluar): ");
        jumlahTiket = sc.nextInt();

        while (jumlahTiket != 0) {
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
            } else {
                totalTiket += jumlahTiket;

                if (jumlahTiket > 10) {
                    diskon = 0.15;
                } else if (jumlahTiket > 4) {
                    diskon = 0.10;
                } else {
                    diskon = 0;
                }

                totalBayar = (int) (jumlahTiket * hargaTiket * (1 - diskon));
                totalHarga += totalBayar;

                System.out.println("Harga tiket: Rp " + (jumlahTiket * hargaTiket));
                System.out.println("Diskon: " + (int) (diskon * 100) + "%");
                System.out.println("Total bayar: Rp " + totalBayar);
            }

            System.out.print("Masukkan jumlah tiket yang ingin dibeli (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalHarga);
    }
}