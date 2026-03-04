package P1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        
        Scanner Farid = new Scanner(System.in);

        System.out.println();

        System.out.println("Menghitung nilai akhir Mahasiswa");

        System.out.println();

        System.out.print("Input nilai Tugas: ");
        double Tugas = Farid.nextDouble();

        System.out.print("Input nilai Kuis: ");
        double Kuis = Farid.nextDouble();

        System.out.print("Input nilai UTS: ");
        double UTS = Farid.nextDouble();

        System.out.print("Input nilai UAS: ");
        double UAS = Farid.nextDouble();

        if (Tugas < 0 || Tugas > 100 ||
            Kuis < 0 || Kuis > 100 ||
            UTS < 0 || UTS > 100 ||
            UAS < 0 || UAS > 100) {
            System.out.println("Input nilai tidak valid, Input nilai kembali\n");
            return;
        }

        Double NilaiAkhir = (0.2 * Tugas) + (0.2 * Kuis) + (0.3 * UTS) + (0.4 * UAS);

        String Huruf;
        
        if (NilaiAkhir >= 80) Huruf = "A";
        else if (NilaiAkhir >= 75) Huruf = "B+";
        else if (NilaiAkhir >= 70) Huruf = "B";
        else if (NilaiAkhir >= 65) Huruf = "C+";
        else if (NilaiAkhir >= 60) Huruf = "C";
        else if (NilaiAkhir >= 50) Huruf = "D";
        else Huruf = "E";

        String Status = (Huruf.equals("A") || Huruf.equals("B+") ||
                         Huruf.equals("B") || Huruf.equals("C+") ||
                         Huruf.equals("C")) ? "Lulus" : "Tidak Lulus";

        System.out.println();

        System.out.println("Nilai Akhir: " + NilaiAkhir);
        System.out.println("Nilai Huruf: " + Huruf);
        System.out.println("Status: " + Status);
        
        System.out.println();
    }
}