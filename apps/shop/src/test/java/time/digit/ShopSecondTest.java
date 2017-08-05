package time.digit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopSecondTest {

    private ShopSecond shopSecond;

    @Test
    public void defaultsTo59ValueWhenExceeds59() throws Exception {
        shopSecond = new ShopSecond(999);
        assertThat(shopSecond.value()).isEqualTo(59);
    }

    @Test
    public void defaultsTo0WhenValueIsNegative() throws Exception {
        shopSecond = new ShopSecond(-5);
        assertThat(shopSecond.value()).isEqualTo(0);
    }

    @Test
    public void canSetCustomSecondOf59() throws Exception {
        shopSecond = new ShopSecond(59);
        assertThat(shopSecond.value()).isEqualTo(59);
    }

    @Test
    public void canSetCustomSecondOf0() throws Exception {
        shopSecond = new ShopSecond(0);
        assertThat(shopSecond.value()).isEqualTo(0);
    }
}