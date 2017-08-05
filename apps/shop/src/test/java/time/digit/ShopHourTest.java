package time.digit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopHourTest {

    private ShopHour shopHour;

    @Test
    public void defaultsTo23ValueWhenExceeds23() throws Exception {
        shopHour = new ShopHour(999);
        assertThat(shopHour.value()).isEqualTo(23);
    }

    @Test
    public void defaultsTo0WhenValueIsNegative() throws Exception {
        shopHour = new ShopHour(-5);
        assertThat(shopHour.value()).isEqualTo(0);
    }

    @Test
    public void canSetCustomSecondOf59() throws Exception {
        shopHour = new ShopHour(23);
        assertThat(shopHour.value()).isEqualTo(23);
    }

    @Test
    public void canSetCustomSecondOf0() throws Exception {
        shopHour = new ShopHour(0);
        assertThat(shopHour.value()).isEqualTo(0);
    }
}