package P2;

public class MatkulMain06 {
    public static void main(String[] args) {

        System.out.println();

        Matkul06 mk1 = new Matkul06();
        mk1.kodeMK = "FF2019";
        mk1.nama = "Basis Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        Matkul06 mk2 = new Matkul06("FF2021", "Sistem Operasi", 2, 4);

        mk1.tampilInformasi();
        System.out.println();

        mk2.tampilInformasi();
        System.out.println();
        
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println();
    }
}