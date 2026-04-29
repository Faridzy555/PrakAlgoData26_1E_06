package P9;

import java.util.Scanner;

public class StackSuratMain {
    public static void main(String[] args) {
        System.out.println();

        Scanner rid = new Scanner(System.in);

        StackSurat06 stack = new StackSurat06(10);
        
        int pilih;

        do {
            System.out.println("MENU:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Pilih: ");
            pilih = rid.nextInt();
            rid.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat        : ");
                    String id = rid.nextLine();
                    System.out.print("Nama            : ");
                    String nama = rid.nextLine();
                    System.out.print("Kelas           : ");
                    String kelas = rid.nextLine();
                    System.out.print("Jenis izin (S/I): ");
                    char jenis = rid.next().charAt(0);
                    System.out.print("Durasi          : ");
                    int durasi = rid.nextInt();

                    Surat06 s = new Surat06(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println();
                    break;

                case 2:
                    Surat06 keluar = stack.pop();
                    if (keluar != null) {
                        System.out.println("Surat diproses:");
                        keluar.tampil();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Surat terakhir:");
                    stack.peek();
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Masukkan nama: ");
                    String cari = rid.nextLine();
                    stack.cari(cari);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Keluar.");
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan salah!");
                    System.out.println();
            }
        } while (pilih != 5);
    }
}