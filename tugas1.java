import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket = 0, totalTiket = 0; 
        int hargaTiket = 50000;
        double totalHargaPenjualan = 0, diskon = 0, totalHarga = 0;
 
        while (true) {
            System.out.print("masukkan jumlah tiket yang terjual (ketik '0' untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("jumlah tidak valid, masukkan lagi jumlah tiket yang valid");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            else if (jumlahTiket > 10) {
                diskon = 0.15;
            }

            double hargaDiskon;

            totalHarga = jumlahTiket * hargaTiket;
            hargaDiskon = totalHarga - (totalHarga * diskon);
            totalTiket += jumlahTiket;
            totalHargaPenjualan += hargaDiskon;

            System.out.println("jumlah tiket: " + jumlahTiket + " tiket");
            System.out.println("total harga tiket Rp " + hargaDiskon);
            System.out.println();
        }

        System.out.println("total tiket terjual hari ini: " + totalTiket + " tiket");
        System.out.println("total harga perjualan hari ini Rp " + totalHargaPenjualan);


    }
}