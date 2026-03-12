package P5;

import java.util.Scanner;

class Faktorial {

    int faktorialBF;
    int faktorialDC;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i=1; i<=n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n==1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}

class FaktorialMain {
    public static void main(String[] args) {
        Scanner farid = new Scanner(System.in);
        System.out.println();

        System.out.print("Input nilai: ");
        int nilai = farid.nextInt();
        System.out.println();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
        System.out.println();
    }
}