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
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println();

            Mahasiswa06 m = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();
        System.out.println();
        
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK:");
        list.bubbleSort();
        list.tampil();

        System.out.println();

        System.out.println("Data yang sudah urut menggunakan SELECTION SORT:");
        list.selectionSort();
        list.tampil();

        System.out.println();

        System.out.println("Data yang sudah urut menggunakan INSERTION SORT:");
        list.insertionSort();
        list.tampil();;
        
        System.out.println();
    }
}