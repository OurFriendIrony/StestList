package stest.lists;

public class StestList {
    private int size;
    private String item;
    private StestList nextItem;

    public int size() {
        return size;
    }

    public void add(String item) {
        if (listIsEmpty()) {
            this.item = item;
            nextItem = new StestList();
        } else {
            nextItem.add(item);
        }
        size+=1;
    }

    private boolean listIsEmpty() {
        return this.item == null;
    }

    public String get(int i) {
        if (i ==0 ) {
            return item;
        }else {
            return nextItem.get(i-1);
        }
    }
}
