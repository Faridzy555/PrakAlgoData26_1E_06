package P4_Kuis1;

import java.util.Scanner;

public class SmartHomeMain06 {
    public static void main(String[] args) {

        Scanner rid = new Scanner(System.in);

        System.out.println();

        System.out.print("Masukkan jumlah device: ");
        int device = rid.nextInt();
        rid.nextLine();

        System.out.println();

        SmartHomeDevice06 arrayDevice[] = new SmartHomeDevice06[device];

        for (int i=0; i<device; i++) {
            System.out.println("Input data device ke-" + (i+1));

            System.out.print("Nama device        : ");
            String nama = rid.nextLine();

            System.out.print("Konsumsi power     : ");
            double konsumsi = rid.nextDouble();

            System.out.print("Stand by Power     : ");
            double powerStand = rid.nextDouble();

            System.out.print("Total energi aktual: ");
            double energiAktual = rid.nextDouble();

            System.out.print("Rasio Efesiensi    : ");
            double rasio = rid.nextDouble();

            arrayDevice[i].printData();
        }
    }
}