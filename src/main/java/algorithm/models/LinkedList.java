package algorithm.models;

public class LinkedList {
    private int value;
    private LinkedList next;

    public LinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkedList{");
        sb.append("value=").append(value);
        sb.append(", next=").append(next.getValue());
        sb.append('}');
        return sb.toString();
    }
}
