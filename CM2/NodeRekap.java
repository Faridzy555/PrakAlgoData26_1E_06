package CM2;

public class NodeRekap {

    RekapAntrian data;
    NodeRekap prev;
    NodeRekap next;

    // konstruktor
    public NodeRekap(NodeRekap prev, RekapAntrian data, NodeRekap next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}