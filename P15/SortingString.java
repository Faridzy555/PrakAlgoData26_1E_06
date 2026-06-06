package P15;

import java.util.ArrayList;
import java.util.Collections;

public class SortingString {
    public static void main(String[] args) {
        System.out.println();

        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        System.out.println(daftarSiswa);
        System.out.println();
    }
}