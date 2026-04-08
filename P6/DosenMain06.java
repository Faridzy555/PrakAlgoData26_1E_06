package P6;

import java.util.Scanner;

public class DosenMain06 {
    public static void main(String[] args) {
        Scanner rid = new Scanner(System.in);
        DataDosen06 data = new DataDosen06();
        int pilih;

        do {
            System.out.println("\nMENU DATA DOSEN:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Seluruh Dosen");
            System.out.println("3. Sorting ASC (Usia - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Pilih menu: ");
            pilih = rid.nextInt();
            rid.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode Dosen: ");
                    String kd = rid.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nm = rid.nextLine();
                    System.out.print("Jenis Kelamin (P/W): ");
                    boolean jk = rid.nextLine().equalsIgnoreCase("P");
                    System.out.print("Usia: ");
                    int us = rid.nextInt();
                    data.tambah(new Dosen06(kd, nm, jk, us));
                    break;
                case 2:
                    System.out.println("\nDaftar Dosen:");
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("\nData berhasil diurutkan (ASC - Termuda ke Tertua):");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("\nData berhasil diurutkan (DSC - Tertua ke Termuda):");
                    data.tampil();
                    break;
            }
        } while (pilih != 5);
        
        System.out.println("Program selesai.");
        System.out.println();
    }
}