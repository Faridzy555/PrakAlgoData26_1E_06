package CM2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner rid = new Scanner(System.in);

        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan pesanan = new DLLPesanan();

        int pilih;

        do {
            System.out.println("SISTEM ANTRIAN ROYAL DELISH:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.println();
            System.out.print("Pilih Menu: ");
            pilih = rid.nextInt();
            rid.nextLine();

            switch (pilih) {
                case 1:
                    // input pembeli
                    System.out.print("Nama Pembeli: ");
                    String nama = rid.nextLine();
                    System.out.print("No HP: ");
                    String hp = rid.nextLine();
                    // buat object pembeli
                    Pembeli pembeli = new Pembeli(nama, hp);
                    // tambah antrian
                    antrian.tambahAntrian(pembeli);
                    System.out.println();
                    break;
                case 2:
                    // tampil antrian
                    antrian.cetakAntrian();
                    System.out.println();
                    break;
                case 3:
                    // hapus antrian depan
                    Pembeli keluar = antrian.hapusAntrian();
                    if (keluar == null) {
                        System.out.println("Antrian kosong");
                    } else {
                        // input pesanan
                        System.out.print("Kode Pesanan: ");
                        int kode = rid.nextInt();
                        rid.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = rid.nextLine();
                        System.out.print("Harga: ");
                        int harga = rid.nextInt();
                        // buat object pesanan
                        Pesanan pesan = new Pesanan(kode, namaPesanan, harga);
                        // simpan pesanan
                        pesanan.tambahPesanan(pesan);
                        System.out.println(keluar.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    System.out.println();
                    break;
                case 4:
                    // tampil laporan pesanan
                    pesanan.tampilPesanan();
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