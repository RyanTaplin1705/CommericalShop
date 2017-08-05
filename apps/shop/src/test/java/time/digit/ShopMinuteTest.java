package time.digit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopMinuteTest {

    private ShopMinute shopMinute;

    @Test
    public void defaultsTo59ValueWhenExceeds59() throws Exception {
        shopMinute = new ShopMinute(999);
        assertThat(shopMinute.value()).isEqualTo(59);
    }

    @Test
    public void defaultsTo0WhenValueIsNegative() throws Exception {
        shopMinute = new ShopMinute(-5);
        assertThat(shopMinute.value()).isEqualTo(0);
    }

    @Test
    public void canSetCustomSecondOf59() throws Exception {
        shopMinute = new ShopMinute(59);
        assertThat(shopMinute.value()).isEqualTo(59);
    }

    @Test
    public void canSetCustomSecondOf0() throws Exception {
        shopMinute = new ShopMinute(0);
        assertThat(shopMinute.value()).isEqualTo(0);
    }
}