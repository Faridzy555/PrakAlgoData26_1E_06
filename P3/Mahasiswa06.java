package P3;

public class Mahasiswa06 {

    public String nama;
    public String nim;
    public String kelas;
    public double ipk;
}

class MahasiswaDemo06 {
    public static void main(String[] args) {
        
        Mahasiswa06[] arrayofMahaisswa = new Mahasiswa06[3];
        arrayofMahaisswa[0] = new Mahasiswa06();
        arrayofMahaisswa[0].nama = "User-1";
        arrayofMahaisswa[0].nim = "111";
        arrayofMahaisswa[0].kelas = "TI-1E"; 
        arrayofMahaisswa[0].ipk = 3.98;

        arrayofMahaisswa[1] = new Mahasiswa06();
        arrayofMahaisswa[1].nama = "User-2";
        arrayofMahaisswa[1].nim = "222";
        arrayofMahaisswa[1].kelas = "TI-1E";
        arrayofMahaisswa[1].ipk = 3.89;

        arrayofMahaisswa[2] = new Mahasiswa06();
        arrayofMahaisswa[2].nama = "User-3";
        arrayofMahaisswa[2].nim = "333";
        arrayofMahaisswa[2].kelas = "TI-1E";
        arrayofMahaisswa[2].ipk = 3.79;

        System.out.println();

        System.out.println("Nama : " + arrayofMahaisswa[0].nama);
        System.out.println("NIM  : " + arrayofMahaisswa[0].nim);
        System.out.println("Kelas: " + arrayofMahaisswa[0].kelas);
        System.out.println("IPK  : " + arrayofMahaisswa[0].ipk);

        System.out.println();

        System.out.println("Nama : " + arrayofMahaisswa[1].nama);
        System.out.println("NIM  : " + arrayofMahaisswa[1].nim);
        System.out.println("Kelas: " + arrayofMahaisswa[1].kelas);
        System.out.println("IPK  : " + arrayofMahaisswa[1].ipk);

        System.out.println();

        System.out.println("Nama : " + arrayofMahaisswa[2].nama);
        System.out.println("NIM  : " + arrayofMahaisswa[2].nim);
        System.out.println("Kelas: " + arrayofMahaisswa[2].kelas);
        System.out.println("IPK  : " + arrayofMahaisswa[2].ipk);

        System.out.println();
    }
}