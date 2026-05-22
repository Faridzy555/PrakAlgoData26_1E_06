package CM2;

public class LinkedListRekapAntrian {

    NodeRekap head;
    NodeRekap tail;

    // update rekap jam
    public void updateRekap(int jam) {
        NodeRekap temp = head;
        while (temp != null) {
            if (temp.data.jamAntri == jam) {
                temp.data.jumlah++;
                return;
            }
            temp = temp.next;
        }
        RekapAntrian rekap = new RekapAntrian(jam, 1);
        NodeRekap baru = new NodeRekap(null, rekap, null);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    // tampil semua rekap
    public void tampilRekap() {
        if (head == null) {
            System.out.println("Belum ada rekap");
            return;
        }
        NodeRekap temp = head;
        System.out.println("REKAP ANTRIAN PER JAM:");
        while (temp != null) {
            System.out.println("Jam " + temp.data.jamAntri + ": " + temp.data.jumlah + " antrian");
            temp = temp.next;
        }
    }

    // tampil jam terbanyak
    public void jamTerbanyak() {
        if (head == null) {
            return;
        }
        NodeRekap temp = head;
        int maxJam = head.data.jamAntri;
        int maxJumlah = head.data.jumlah;
        while (temp != null) {
            if (temp.data.jumlah > maxJumlah) {
                maxJumlah = temp.data.jumlah;
                maxJam = temp.data.jamAntri;
            }
            temp = temp.next;
        }
        System.out.println("JAM ANTRIAN TERBANYAK:");
        System.out.println("Jam: " + maxJam);
        System.out.println("Jumlah Antrian: " + maxJumlah);
    }
}