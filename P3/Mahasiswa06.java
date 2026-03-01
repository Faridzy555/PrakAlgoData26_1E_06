package P3;

import java.util.Scanner;

public class Mahasiswa06 {

    public String nama;
    public String nim;
    public String kelas;
    public double ipk;
}

class MahasiswaDemo06 {
    public static void main(String[] args) {

        Scanner Farid = new Scanner(System.in);

        System.out.println();

        Mahasiswa06[] arrayofMahasiswa = new Mahasiswa06[3];

        for (int i=0; i<3; i++) {
            arrayofMahasiswa[i] = new Mahasiswa06();
            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            System.out.print("Nama : ");
            arrayofMahasiswa[i].nama = Farid.nextLine();
            System.out.print("NIM  : ");
            arrayofMahasiswa[i].nim = Farid.nextLine();
            System.out.print("Kelas: ");
            arrayofMahasiswa[i].kelas = Farid.nextLine();
            System.out.print("IPK  : ");
            arrayofMahasiswa[i].ipk = Farid.nextDouble();
            Farid.nextLine();
            System.out.println();
        }

        for (int i=0; i<3; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("Nama : " + arrayofMahasiswa[i].nama);
            System.out.println("NIM  : " + arrayofMahasiswa[i].nim);
            System.out.println("Kelas: " + arrayofMahasiswa[i].kelas);
            System.out.println("IPK  : " + arrayofMahasiswa[i].ipk);

            System.out.println();
        }
    }
}