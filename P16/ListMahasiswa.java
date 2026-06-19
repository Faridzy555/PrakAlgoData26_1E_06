package P16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {

    List<Mahasiswa> listMhs = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        listMhs.addAll(List.of(mahasiswa));
    }

    public void hapus(int index) {
        listMhs.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        listMhs.set(index, mhs);
    }

    public void tampil() {
        listMhs.forEach(mhs -> {
            System.out.println(mhs);
        });
        System.out.println();
    }

    public int linearSearch(String nim) {
        for (int i = 0; i < listMhs.size(); i++) {
            if (nim.equals(listMhs.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public void sortingAsc() {
        Collections.sort(listMhs, Comparator.comparing(m -> m.nama));
    }

    public void sortingDesc() {
        Collections.sort(listMhs,
                Comparator.comparing((Mahasiswa m) -> m.nama).reversed());
    }

    public static void main(String[] args) {
        System.out.println();

        ListMahasiswa lm = new ListMahasiswa();

        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);

        System.out.println("Data Awal");
        lm.tampil();

        lm.update(lm.linearSearch("201235"),
                new Mahasiswa("201235", "Akhleema Lela", "021xx2"));

        System.out.println("Setelah Update");
        lm.tampil();

        System.out.println("Sorting Ascending");
        lm.sortingAsc();
        lm.tampil();

        System.out.println("Sorting Descending");
        lm.sortingDesc();
        lm.tampil();
    }
}