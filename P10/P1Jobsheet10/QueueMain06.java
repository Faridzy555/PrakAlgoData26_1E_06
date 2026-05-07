package P10.P1Jobsheet10;

import java.util.Scanner;

public class QueueMain06 {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
    }
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas Queue: ");
        int n = sc.nextInt();

        Queue06 Q = new Queue06(n);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    System.out.println();
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        System.out.println();
                    break;
                    }
                case 3:
                    Q.print();
                    System.out.println();
                    break;
                case 4:
                    Q.peek();
                    System.out.println();
                    break;
                case 5:
                    Q.clear();
                    System.out.println();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        System.out.println();
    }
}