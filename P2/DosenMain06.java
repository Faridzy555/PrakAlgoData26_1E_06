package P2;

public class DosenMain06 {
    public static void main(String[] args) {
        
        System.out.println();

        Dosen06 dsn1 = new Dosen06();

        dsn1.nama = "Dosen1";
        dsn1.idDosen = "123456789";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 1998;
        dsn1.bidangKeahlian = "Front-End Developer";
        dsn1.menampilkanInformasi();
        dsn1.ubahkeahlian("Software Engineer");
        System.out.println("Masa kerja: " + dsn1.hitungMasaKerja(2024) + " tahun");
        System.out.println();

        Dosen06 dsn2 = new Dosen06("Dosen2", "987654321", true, 2008, "Back-End Developer");
        dsn2.menampilkanInformasi();
        dsn2.ubahkeahlian("AI Engineer");
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
        System.out.println();
    }
}