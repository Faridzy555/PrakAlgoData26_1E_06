package CM2;

public class DLLPesanan {

    NodePesanan head;
    NodePesanan tail;

    // method tambah pesanan
    public void tambahPesanan(Pesanan pesanan) {
        NodePesanan baru = new NodePesanan(null, pesanan, null);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    // sorting manual berdasarkan nama pesanan
    public void sortingPesanan() {
        boolean tukar;
        do {
            tukar = false;
            NodePesanan current = head;
            while (current != null && current.next != null) {
                // bandingkan nama pesanan
                if (current.data.namaPesanan.compareToIgnoreCase(
                    current.next.data.namaPesanan) > 0) {
                    // tukar data
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }

    // tampil laporan pesanan
    public void tampilPesanan() {
        if (head == null) {
            System.out.println("Belum ada pesanan");
            return;
        }
        sortingPesanan();
        NodePesanan temp = head;
        System.out.println("LAPORAN PESANAN:");
        System.out.printf("%-10s %-20s %-10s\n", "Kode", "Nama Pesanan", "Harga");
        while (temp != null) {
            System.out.printf("%-10d %-20s %-10d\n",
            temp.data.kodePesanan,
            temp.data.namaPesanan,
            temp.data.harga);
            temp = temp.next;
        }
    }
}