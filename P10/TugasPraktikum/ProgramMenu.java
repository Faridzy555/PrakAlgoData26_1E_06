package P10.TugasPraktikum;

import java.util.Scanner;
import P10.P2Jobsheet10.Mahasiswa06;

public class ProgramMenu {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;

        do {
            System.out.println("MENU KRS:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses KRS (2 orang)");
            System.out.println("3. Lihat Semua");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Dilayani");
            System.out.println("8. Sisa Belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa06(nim, nama, prodi, kelas));
                    System.out.println();
                    break;

                case 2:
                    antrian.prosesKRS();
                    System.out.println();
                    break;

                case 3:
                    antrian.tampilSemua();
                    System.out.println();
                    break;

                case 4:
                    antrian.lihat2Terdepan();
                    System.out.println();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    System.out.println();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    System.out.println();
                    break;

                case 7:
                    antrian.jumlahDilayani();
                    System.out.println();
                    break;

                case 8:
                    antrian.sisaBelumDilayani();
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Selesai");
                    System.out.println();
                    break;
            }

        } while (pilih != 0);

        System.out.println();
    }
}