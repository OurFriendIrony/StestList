package stest.lists;

public class StestList {
    private int size;
    private String item;
    private StestList nextItem;

    public int size() {
        return size;
    }

    public void add(String item) {
        if (this.item == null) {
            this.item = item;
        } else {
            nextItem = new StestList();
            nextItem.add(item);
        }
        size+=1;
    }

    public String get(int i) {
        if (i ==0 ) {
            return item;
        }else {
            return nextItem.get(i-1);
        }
    }
}
