package P1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner Farid = new Scanner(System.in);

        System.out.println();
        
        String Matkul[] = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

        int SKS[] = {2, 2, 2, 3, 2, 2, 3, 2};
        double NilaiAngka[] = new double[Matkul.length];
        String NilaiHuruf[] = new String[Matkul.length];
        double BobotNilai[] = new double[Matkul.length];

        System.out.println("===================================");
        System.out.println("Menghitung Indeks Prestasi Semester");
        System.out.println("===================================");

        System.out.println();

        for (int i = 0; i < Matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk Mata Kuliah " + Matkul[i] + ": ");
            NilaiAngka[i] = Farid.nextDouble();
            
            if (NilaiAngka[i] > 80) { NilaiHuruf[i] = "A"; BobotNilai[i] = 4.0; }
            else if (NilaiAngka[i] > 73) { NilaiHuruf[i] = "B+"; BobotNilai[i] = 3.5; }
            else if (NilaiAngka[i] > 65) { NilaiHuruf[i] = "B"; BobotNilai[i] = 3.0; }
            else if (NilaiAngka[i] > 60) { NilaiHuruf[i] = "C+"; BobotNilai[i] = 2.5; }
            else if (NilaiAngka[i] > 50) { NilaiHuruf[i] = "C"; BobotNilai[i] = 2.0; }
            else if (NilaiAngka[i] > 39) { NilaiHuruf[i] = "D"; BobotNilai[i] = 1.0; }
            else {NilaiHuruf[i] = "E"; BobotNilai[i] = 0.0;}
        }

        System.out.println();
        
        System.out.println("Hasil Konversi Nilai:");

        System.out.println();

        System.out.println("==============================================================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("==============================================================================");
        
        double TotalBobotSKS = 0;
        int TotalSKS = 0;
        for (int i = 0; i < Matkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", Matkul[i], NilaiAngka[i], NilaiHuruf[i], BobotNilai[i]);
            TotalBobotSKS += (BobotNilai[i] * SKS[i]);
            TotalSKS += SKS[i];
        }
        
        double IP = TotalBobotSKS / TotalSKS;
        System.out.println("==============================================================================");

        System.out.println();

        System.out.printf("Indeks Prestasi: %.2f\n", IP);

        System.out.println();
    }
}