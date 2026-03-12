package P5;

import java.util.Scanner;

class Sum {

    double keuntungan[];

    Sum(int el) {
        keuntungan = new double[el];
    }

    double totalBF() {
        double total = 0;
        for (int i=0; i<keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l+r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum;
    }
}

class SumMain {
    public static void main(String[] args) {
        Scanner farid = new Scanner(System.in);
        System.out.println();

        System.out.print("Input jumlah elemen: ");
        int elemen = farid.nextInt();
        System.out.println();

        Sum sm = new Sum(elemen);

        for (int i=0; i<elemen; i++) {
            System.out.print("Input keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = farid.nextDouble();
        }
        System.out.println();

        System.out.println("Total keuntungan menggunakan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
        System.out.println();
    }
}