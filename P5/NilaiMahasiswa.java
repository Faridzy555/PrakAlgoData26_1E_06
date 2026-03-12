package P5;

import java.util.Scanner;

class Mahasiswa {

    String nama;
    int uts;
    int uas;

    Mahasiswa(String nama, int uts, int uas) {
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }
}

public class NilaiMahasiswa {

    static int maxUTS(Mahasiswa arr[], int left, int right) {
        if(left == right){
            return arr[left].uts;
        }

        int mid = (left + right) / 2;

        int maxLeft = maxUTS(arr, left, mid);
        int maxRight = maxUTS(arr, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }

    static int minUTS(Mahasiswa arr[], int left, int right) {
        if(left == right){
            return arr[left].uts;
        }

        int mid = (left + right) / 2;

        int minLeft = minUTS(arr, left, mid);
        int minRight = minUTS(arr, mid + 1, right);

        return Math.min(minLeft, minRight);
    }

    static double rataUAS(Mahasiswa arr[]) {
        int total = 0;

        for(int i = 0; i < arr.length; i++){
            total += arr[i].uas;
        }

        return (double) total / arr.length;
    }

    public static void main(String[] args) {

        Scanner farid = new Scanner(System.in);
        System.out.println();

        System.out.print("Input jumlah mahasiswa: ");
        int n = farid.nextInt();
        farid.nextLine();

        Mahasiswa[] mhs = new Mahasiswa[n];
        System.out.println();

        for(int i = 0; i < n; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("Nama     : ");
            String nama = farid.nextLine();

            System.out.print("Nilai UTS: ");
            int uts = farid.nextInt();

            System.out.print("Nilai UAS: ");
            int uas = farid.nextInt();
            farid.nextLine();

            mhs[i] = new Mahasiswa(nama, uts, uas);

            System.out.println();
        }

        int nilaiMax = maxUTS(mhs, 0, n-1);
        int nilaiMin = minUTS(mhs, 0, n-1);
        double rata = rataUAS(mhs);

        System.out.println("Hasil perhitungan");
        System.out.println("Nilai UTS tertinggi: " + nilaiMax);
        System.out.println("Nilai UTS terendah : " + nilaiMin);
        System.out.println("Rata-rata nilai UAS: " + rata);
        System.out.println();
    }
}