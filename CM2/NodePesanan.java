package CM2;

public class NodePesanan {

    Pesanan data;
    NodePesanan prev;
    NodePesanan next;

    // konstruktor node
    public NodePesanan(NodePesanan prev, Pesanan data, NodePesanan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}