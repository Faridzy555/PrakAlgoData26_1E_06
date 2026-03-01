package P2;

public class MahasiswaMain06 {
    public static void main(String[] args) {

        System.out.println();

        Mahasiswa06 mhs1 = new Mahasiswa06();
        mhs1.Nama = "Farid Febrianto";
        mhs1.NIM = "254107020232";
        mhs1.Kelas = "TI 1E";
        mhs1.IPK = 3.79;
        mhs1.TampilkanInformasi();
        System.out.println();

        mhs1.UbahKelas("TI 1F");
        mhs1.UpdateIPK(3.95);
        mhs1.TampilkanInformasi();
        System.out.println();

        Mahasiswa06 mhs2 = new Mahasiswa06("Bruce Wayne", "254107020234",3.87, "TI 1E");
        mhs2.UpdateIPK(3.98);
        mhs2.TampilkanInformasi();
        System.out.println();
        
        Mahasiswa06 mhsRidzy = new Mahasiswa06("Ridzy", "123456789", 3.74, "TI-1E");
    }
}