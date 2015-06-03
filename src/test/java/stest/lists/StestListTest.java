package stest.lists;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StestListTest {

    @Test
    public void listSizeZeroWhenListEmpty() {
        assertThat(new StestList().size()).isEqualTo(0);
    }

    @Test
    public void listSizeOneWhenItemAdded() {
        StestList list = new StestList();
        list.add("");
        assertThat(list.size()).isEqualTo(1);
    }

    @Test
    public void addedItemRetrievable() {
        StestList list = new StestList();
        list.add("wibble");
        assertThat(list.get(0)).isEqualTo("wibble");
    }
}
