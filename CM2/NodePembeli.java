package CM2;

public class NodePembeli {

    Pembeli data;
    NodePembeli prev;
    NodePembeli next;

    // konstruktor node
    public NodePembeli(NodePembeli prev, Pembeli data, NodePembeli next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}