package stest.lists;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StestListTest {

    StestList list;

    @Before
    public void setup() {

        list = new StestList();
    }

    @Test
    public void listSizeZeroWhenListEmpty() {
        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    public void listSizeOneWhenItemAdded() {
        list.add("");
        assertThat(list.size()).isEqualTo(1);
    }

    @Test
    public void addedItemRetrievable() {
        list.add("wibble");
        assertThat(list.get(0)).isEqualTo("wibble");
    }

    @Test
    public void secondAddedItemRetrievable() {
        list.add("first");
        list.add("second");
        assertThat(list.get(0)).isEqualTo("first");
        assertThat(list.get(1)).isEqualTo("second");
    }

    @Test
    public void thirdAddedItemRetrievable() {
        list.add("first");
        list.add("second");
        list.add("third");
        assertThat(list.get(0)).isEqualTo("first");
        assertThat(list.get(1)).isEqualTo("second");
        assertThat(list.get(2)).isEqualTo("third");
    }
}
