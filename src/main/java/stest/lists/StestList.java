package stest.lists;

public class StestList {
    private int size;
    private String item;
    private StestList nextItem;

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
        if (pos == 0) {
            return item;
        } else {
            return nextItem.get(pos-1);
        }
    }

    private boolean thisNodeIsUsed() {
        return this.item != null;
    }

    private void addToThisNode(String item) {
        this.item = item;
        nextItem = new StestList();
    }

    private void addToNextNode(String item) {
        nextItem.add(item);
    }
}
