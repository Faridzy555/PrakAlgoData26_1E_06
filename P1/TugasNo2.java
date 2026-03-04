package P1;

import java.util.Scanner;

public class TugasNo2 {

    static Scanner Farid = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println();

        System.out.print("Input jumlah jadwal: ");
        int n = Farid.nextInt();
        Farid.nextLine();

        String Jadwal[][] = new String[n][4];

        InputJadwal(Jadwal);
        TampilJadwal(Jadwal);
        CariHari(Jadwal);
        CariMatkul(Jadwal);
    }

    static void InputJadwal(String j[][]) {
        System.out.println("\nInput data jadwal:");

        for(int i=0; i<j.length; i++){
            System.out.println("\nJadwal ke-" + (i+1));

            System.out.print("Mata Kuliah : ");
            j[i][0] = Farid.nextLine();

            System.out.print("Ruang       : ");
            j[i][1] = Farid.nextLine();

            System.out.print("Hari        : ");
            j[i][2] = Farid.nextLine();

            System.out.print("Jam         : ");
            j[i][3] = Farid.nextLine();
        }
    }
 
    static void TampilJadwal(String j[][]) {
        System.out.println("\nJadwal Kuliah:");

        System.out.println("===================================================");
        System.out.printf("%-15s %-10s %-10s %-10s\n",
                "MATA KULIAH", "RUANG", "HARI", "JAM");
        System.out.println("===================================================");

        for(String Data[] : j){
            System.out.printf("%-15s %-10s %-10s %-10s\n",
                    Data[0], Data[1], Data[2], Data[3]);
        }

        System.out.println("===================================================");
    }

    static void CariHari(String j[][]) {
        System.out.print("\nCari jadwal berdasarkan hari: ");
        String Hari = Farid.nextLine();

        boolean Ketemu = false;

        for(String Data[] : j) {
            if(Data[2].equalsIgnoreCase(Hari)) {
                System.out.println(Data[0] + " | " + Data[1] + " | " + Data[3]);
                Ketemu = true;
            }
        }

        if(!Ketemu)
            System.out.println("Tidak ada jadwal pada hari tersebut");
    }

    static void CariMatkul(String j[][]) {
        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String Matkul = Farid.nextLine();

        boolean Ketemu = false;

        for(String Data[] : j) {
            if(Data[0].equalsIgnoreCase(Matkul)) {
                System.out.println(Data[0] + " | " + Data[1] + " | " + Data[2] + " | " + Data[3]);
                Ketemu = true;
            }
        }

        if(!Ketemu)
            System.out.println("Mata kuliah tidak ditemukan");

        System.out.println();
    }
}