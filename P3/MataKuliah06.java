package P3;

import java.util.Scanner;

public class MataKuliah06 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah06 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void cetakInfo() {
        System.out.println("Kode      : " + kode);
        System.out.println("Nama      : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }
}

class MataKuliahDemo06 {
    public static void main(String[] args) {
        
        Scanner Farid = new Scanner(System.in);

        System.out.println();

        System.out.print("Input jumlah user data: ");
        int n = Farid.nextInt();
        Farid.nextLine();

        MataKuliah06[] arrayMK = new MataKuliah06[n];

        MataKuliah06[] arrayofMatakuliah = new MataKuliah06[n];
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.println();

        System.out.println("INPUT DATA MATA KULIAH:");

        System.out.println();

        for(int i=0; i<n; i++) {
            System.out.println("Input data mata kuliah ke-" + (i+1));
            System.out.print("Kode        :");
            kode = Farid.nextLine();
            System.out.print("Nama        :");
            nama = Farid.nextLine();
            System.out.print("SKS         :");
            dummy = Farid.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam  :");
            dummy =  Farid.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            System.out.println();

            System.out.println("HASIL DATA KULIAH: ");
            
            System.out.println();

            arrayofMatakuliah[i] = new MataKuliah06(kode, nama, sks, jumlahJam);
            arrayofMatakuliah[i].cetakInfo();

            System.out.println();
        }

        System.out.println("MENAMPILKAN DATA MATA KULIAH:");

        System.out.println();
        
        for (int i=0; i<n; i++) {
                System.out.println("Data mata kuliah ke-" + (i+1));
                System.out.println("Kode      : " + arrayofMatakuliah[i].kode);
                System.out.println("Nama      : " + arrayofMatakuliah[i].nama);
                System.out.println("SKS       : " + arrayofMatakuliah[i].sks);
                System.out.println("Jumlah jam: " + arrayofMatakuliah[i].jumlahJam);

                System.out.println();
        }
    }
}