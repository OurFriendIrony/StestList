package stest.lists;

public class StestList {

    public String item;
    public StestList nextItem;

    public int size() {
        if (thisNodeIsUsed()) {
            return nextItem.size() + 1;
        }
        return 0;
    }

    public void add(String item) {
        if (thisNodeIsUsed()) {
            addToNextNode(item);
        } else {
            addToThisNode(item);
        }
    }

    public String get(int pos) {
        if (itemFound(pos)) {
            return item;
        }
        return nextItem.get(pos-1);
    }

    public void remove(int pos) {
        if (itemFound(pos)) {
            removeThisNode();
        } else {
            removeNextNode(pos);
        }
    }

    private boolean thisNodeIsUsed() {
        return this.item != null;
    }

    private boolean itemFound(int pos) {
        return pos == 0;
    }

    private void addToThisNode(String item) {
        this.item = item;
        this.nextItem = new StestList();
    }

    private void addToNextNode(String item) {
        nextItem.add(item);
    }

    private void removeThisNode() {
        this.item = nextItem.item;
        this.nextItem = nextItem.nextItem;
    }

    private void removeNextNode(int pos) {
        nextItem.remove(pos-1);
    }
}
