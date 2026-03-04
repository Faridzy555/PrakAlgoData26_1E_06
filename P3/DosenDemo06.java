package P3;

import java.util.Scanner;

class Dosen06 {

    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen06(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void infoDosen() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Usia         : " + usia);
    }
}

class DataDosen06 {

    void dataSemuaDosen(Dosen06 dosenArray[]) {
        System.out.println("\nData semua Dosen:");
        System.out.println();
        for (Dosen06 d : dosenArray) {
            d.infoDosen();
            System.out.println();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen06 dosenArray[]) {
        int pria = 0, wanita = 0;

        for (Dosen06 d : dosenArray) {
            if (d.jenisKelamin.equalsIgnoreCase("L")) {
                pria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("P")) {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println();
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen06 dosenArray[]) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen06 d : dosenArray) {
            if (d.jenisKelamin.equalsIgnoreCase("L")) {
                totalPria += d.usia;
                jumlahPria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("P")) {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            System.out.println("Rata-rata usia dosen pria  : " + (totalPria / jumlahPria));
        }

        if (jumlahWanita > 0) {
            System.out.println("Rata-rata usia dosen wanita: " + (totalWanita / jumlahWanita));
        }
    }

    void infoDosenPalingMuda(Dosen06 dosenArray[]) {
        Dosen06 termuda = dosenArray[0];

        for (Dosen06 d : dosenArray) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\nDosen paling muda:");
        termuda.infoDosen();
    }

    void infoDosenPalingTua(Dosen06 dosenArray[]) {
        Dosen06 tertua = dosenArray[0];

        for (Dosen06 d : dosenArray) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\nDosen paling tua:");
        tertua.infoDosen();
    }
}

public class DosenDemo06 {
    public static void main(String[] args) {

        Scanner farid = new Scanner(System.in);

        System.out.println();

        System.out.print("Input jumlah data dosen: ");
        int jumlahDosen = farid.nextInt();
        farid.nextLine();

        Dosen06 dosenArray[] = new Dosen06[jumlahDosen];

        for (int i=0; i<jumlahDosen; i++) {

            System.out.println("\nInput data dosen ke-" + (i+1));

            System.out.print("Kode               : ");
            String kode = farid.nextLine();

            System.out.print("Nama               : ");
            String nama = farid.nextLine();

            System.out.print("Jenis kelamin (L/P): ");
            String jenisKelamin = farid.nextLine();

            System.out.print("Usia               : ");
            int umur = farid.nextInt();
            farid.nextLine();

            dosenArray[i] = new Dosen06(kode, nama, jenisKelamin, umur);
        }

        DataDosen06 data = new DataDosen06();

        data.dataSemuaDosen(dosenArray);
        data.jumlahDosenPerJenisKelamin(dosenArray);
        data.rerataUsiaDosenPerJenisKelamin(dosenArray);
        data.infoDosenPalingMuda(dosenArray);
        data.infoDosenPalingTua(dosenArray);
        System.out.println();
    }
}