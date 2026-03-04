package P1;

import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {

        Scanner Farid = new Scanner(System.in);

        System.out.println();

        char Kode[] = {'A','B','D','E','F','G','H','L','N','T'};

        char Kota[][] = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Masukkan kode plat: ");
        char Plat = Farid.next().toUpperCase().charAt(0);

        boolean Ketemu = false;

        for (int i=0; i<Kode.length; i++){
            if (Plat == Kode[i]){

                System.out.print("Kota: ");

                for(int j=0; j<Kota[i].length; j++){
                    System.out.print(Kota[i][j]);
                }

                System.out.println();
                Ketemu = true;
                break;
            }
        }

        if(!Ketemu)
            System.out.println("Kode Tidak Ditemukan");

        System.out.println();
    }
}