package data_structures.graph;

public class Edge<V> {
    private Node<V> origin;
    private Node<V> destination;
    private int weight;

    public Edge(Node<V> origin, Node<V> destination, int distance) {
        this.origin = origin;
        this.destination = destination;
        this.weight = distance;
    }

    public Node<V> getOrigin() {
        return origin;
    }

    public void setOrigin(Node<V> origin) {
        this.origin = origin;
    }

    public Node<V> getDestination() {
        return destination;
    }

    public void setDestination(Node<V> destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return weight;
    }

    public void setDistance(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "";
    }

}