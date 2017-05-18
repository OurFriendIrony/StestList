package uk.co.ourfriendirony.list;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StestListTest {

    StestList<String> stringList;
    StestList<Integer> integerList;

    @Before
    public void setup() {
        stringList = new StestList<>();
        integerList = new StestList<>();
    }

    @Test
    public void listSizeZeroWhenListEmpty() {
        assertThat(stringList.size()).isEqualTo(0);
    }

    @Test
    public void listSizeOneWhenItemAdded() {
        stringList.add("");
        assertThat(stringList.size()).isEqualTo(1);
    }

    @Test
    public void addedItemRetrievable() {
        stringList.add("wibble");
        assertThat(stringList.get(0)).isEqualTo("wibble");
    }

    @Test
    public void secondAddedItemRetrievable() {
        stringList.add("first");
        stringList.add("second");
        assertThat(stringList.get(0)).isEqualTo("first");
        assertThat(stringList.get(1)).isEqualTo("second");
    }

    @Test
    public void thirdAddedItemRetrievable() {
        stringList.add("first");
        stringList.add("second");
        stringList.add("third");
        assertThat(stringList.get(0)).isEqualTo("first");
        assertThat(stringList.get(1)).isEqualTo("second");
        assertThat(stringList.get(2)).isEqualTo("third");
    }

    @Test
    public void removalOfItemResizesArray() {
        stringList.add("first");
        stringList.add("second");
        stringList.add("third");
        stringList.remove(1);
        assertThat(stringList.get(0)).isEqualTo("first");
        assertThat(stringList.get(1)).isEqualTo("third");
        assertThat(stringList.size()).isEqualTo(2);
    }

    @Test
    public void addedItemsCanBeOfTypeString() {
        stringList.add("");
        assertThat(stringList.type()).isEqualTo(String.class);
    }

    @Test
    public void addedItemsCanBeOfTypeInteger() {
        integerList.add(1);
        assertThat(integerList.type()).isEqualTo(Integer.class);
    }
}
