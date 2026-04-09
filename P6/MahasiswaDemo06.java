package P6;

import java.util.Scanner;

class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        
        int jmlMhs = 2;

        // Proses input dinamis
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Input data mahasiswa ke-" + (i+1));
            System.out.print("NIM  : ");
            String nim = input.nextLine();
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK  : ");
            String ip = input.nextLine();
            Double ipk = Double.parseDouble(ip);
            
            list.tambah (new Mahasiswa06(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println();

        // melakukan pencarian data sequential
        System.out.println("PENCARIAN DATA SEQUENTIAL");
        System.out.print("Input ipk mahasiswa yang di cari: ");
        double cari = input.nextDouble();
        System.out.println();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        System.out.println();
        list.tampilDataSearch(cari, pss);
        System.out.println();

        // melakukan pencarian data binary
        System.out.println("PENCARIAN DATA BINARY");
        System.out.print("Masukkan ipk mahasiswa yang dicari: ");
        cari = input.nextDouble();
        System.out.println();

        System.out.println("Menggunakan binary search");
        double posisi2 = list.findBinarySearch(cari, 0, jmlMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        System.out.println();
        list.tampilDataSearch(cari, pss2);
        System.out.println();
    }
}