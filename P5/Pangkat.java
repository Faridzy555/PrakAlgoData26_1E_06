package P5;

import java.util.Scanner;

class Pangkat {

    int nilai, pangkat;

    Pangkat(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    int PangkatBF(int a, int n) {
        int hasil = 1;
        for (int i=0; i<n; i++) {
            hasil = hasil*a;
        }
        return hasil; 
    }

    int PangkatDC(int a, int n) {
        if (n==1) {
            return a;
        } else {
            if (n%2==1) {
                return (PangkatDC(a, n/2) * PangkatDC(a, n/2) * a);
            } else {
                return (PangkatDC(a, n/2) * PangkatDC(a, n/2));
            }
        }
    }
}

class PangkatMain {
    public static void main(String[] args) {
        Scanner farid = new Scanner(System.in);
        System.out.println();

        System.out.print("Input jumlah elemen: ");
        int elemen = farid.nextInt();
        System.out.println();

        Pangkat png[] = new Pangkat[elemen];
        for (int i=0; i<elemen; i++) {
            System.out.print("Input nilai basis elemen ke-" + (i+1) + ": ");
            int basis = farid.nextInt();
            System.out.print("Input nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = farid.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }
        System.out.println();

        System.out.println("HASIL PANGKAT BRUTE FORCE:");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.PangkatBF(p.nilai, p.pangkat));
        }
        System.out.println();
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.PangkatDC(p.nilai, p.pangkat));
        }
        System.out.println();
    }
}