package stest.lists;

public class StestList<T> {
    public T value;
    public StestList<T> nextNode;

    public int size() {
        if (thisNodeIsUsed()) {
            return nextNode.size() + 1;
        }
        return 0;
    }

    public void add(T value) {
        if (thisNodeIsUsed()) {
            addToNextNode(value);
        } else {
            addToThisNode(value);
        }
    }

    public T get(int pos) {
        if (valueFound(pos)) {
            return value;
        }
        return nextNode.get(pos - 1);
    }

    public void remove(int pos) {
        if (valueFound(pos)) {
            removeThisNode();
        } else {
            removeNextNode(pos);
        }
    }

    private boolean thisNodeIsUsed() {
        return this.value != null;
    }

    private boolean valueFound(int pos) {
        return pos == 0;
    }

    private void addToThisNode(T value) {
        this.value = value;
        this.nextNode = new StestList<>();
    }

    private void addToNextNode(T value) {
        nextNode.add(value);
    }

    private void removeThisNode() {
        this.value = getNextNodeValue();
        this.nextNode = getNextNode();
    }

    private StestList<T> getNextNode() {
        return nextNode.nextNode;
    }

    private T getNextNodeValue() {
        return nextNode.value;
    }

    private void removeNextNode(int pos) {
        nextNode.remove(pos - 1);
    }

    public Object type() {
        return value.getClass();
    }
}
