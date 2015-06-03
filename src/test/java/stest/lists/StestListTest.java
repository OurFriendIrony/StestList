package stest.lists;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StestListTest {

    @Test
    public void listSizeZeroWhenListEmpty() {
        assertThat(new StestList().size()).isEqualTo(0);
    }
}
