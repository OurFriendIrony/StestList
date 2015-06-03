package stest.lists;

public class StestList {
    private int size;
    private String item;
    private StestList nextItem;

    public int size() {
        if (thisNodeIsUsed()) {
            return nextItem.size()+1;
        }
        return 0;
    }

    public void add(String item) {
        if (thisNodeIsUsed()) {
            nextItem.add(item);
        } else {
            this.item = item;
            nextItem = new StestList();
        }
    }

    public String get(int i) {
        if (i ==0 ) {
            return item;
        }else {
            return nextItem.get(i-1);
        }
    }

    private boolean thisNodeIsUsed() {
        return this.item != null;
    }
}
