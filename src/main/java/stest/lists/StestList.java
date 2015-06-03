package stest.lists;

public class StestList {
    private int size;
    private String item;

    public int size() {
        return size;
    }

    public void add(String item) {
        this.item = item;
        size+=1;
    }

    public String get(int i) {
        return item;
    }
}
