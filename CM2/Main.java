package CM2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner rid = new Scanner(System.in);

        DLLPembeli antrean = new DLLPembeli();
        DLLPesanan pesanan = new DLLPesanan();
        LinkedListRekapAntrian rekap = new LinkedListRekapAntrian();

        int pilih;

        do {
            System.out.println("SISTEM ANTRIAN ROYAL DELISH:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Rekap Antrian");
            System.out.println("0. Keluar");
            System.out.println();
            System.out.print("Pilih Menu: ");
            pilih = rid.nextInt();
            rid.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = rid.nextLine();
                    System.out.print("No HP: ");
                    String hp = rid.nextLine();
                    System.out.print("Jam Antri: ");
                    int jam = rid.nextInt();
                    Pembeli pembeli = new Pembeli(nama, hp);
                    antrean.tambahAntrian(pembeli);
                    rekap.updateRekap(jam);
                    System.out.println();
                    break;
                case 2:
                    antrean.cetakAntrian();
                    System.out.println();
                    break;
                case 3:
                    Pembeli keluar = antrean.hapusAntrian();
                    if (keluar == null) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.print("Kode Pesanan: ");
                        int kode = rid.nextInt();
                        rid.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = rid.nextLine();
                        System.out.print("Harga: ");
                        int harga = rid.nextInt();
                        Pesanan pesan = new Pesanan(kode, namaPesanan, harga);
                        pesanan.tambahPesanan(pesan);
                        System.out.println(keluar.namaPembeli + " telah memesan " + namaPesanan);
                        System.out.println();
                    }
                    break;
                case 4:
                    pesanan.tampilPesanan();
                    System.out.println();
                    break;
                case 5:
                    rekap.tampilRekap();
                    rekap.jamTerbanyak();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    System.out.println();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    System.out.println();
            }
        } while (pilih != 0);
    }
}