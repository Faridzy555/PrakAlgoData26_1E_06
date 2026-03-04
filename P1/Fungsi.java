package P1;

import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {

        Scanner Farid = new Scanner(System.in);

        System.out.println();
        
        for(int i=0; i<Stock.length; i++){
            int Pendapatan = HitungPendapatan(i);
            System.out.println("Cabang " + (i+1) + " = Rp" + Pendapatan);

            if (Pendapatan > 1500000)
                System.out.println("Status: Sangat Baik");
            else
                System.out.println("Status: Perlu Evaluasi");

            System.out.println();
        }
    }

    static int Stock[][] = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
    };

    static int Harga[] = {75000, 50000, 60000, 10000};

    static int HitungPendapatan(int Cabang){
        int total = 0;
        for(int j=0; j<Stock[Cabang].length; j++){
            total += Stock[Cabang][j] * Harga[j];
        }
        return total;
    }
}