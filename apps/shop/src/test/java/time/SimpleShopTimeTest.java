package time;

import org.junit.Test;
import time.digit.ShopHour;
import time.digit.ShopMinute;
import time.digit.ShopSecond;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleShopTimeTest {

    private SimpleShopTime simpleShopDate = new SimpleShopTime();

    @Test
    public void defaultTimeIsMidnight() throws Exception {
        assertThat(simpleShopDate.value()).hasHourOfDay(0);
        assertThat(simpleShopDate.value()).hasMinute(0);
        assertThat(simpleShopDate.value()).hasSecond(0);
    }

    @Test
    public void canSetTimeToHaveCustomHourOf24() throws Exception {
        simpleShopDate.withHour(new ShopHour(23));
        assertThat(simpleShopDate.value()).hasHourOfDay(23);
    }

    @Test
    public void canSetTimeToHaveCustomHourOf0() throws Exception {
        simpleShopDate.withHour(new ShopHour(0));
        assertThat(simpleShopDate.value()).hasHourOfDay(0);
    }

    @Test
    public void canSetTimeToHaveCustomMinuteOf59() throws Exception {
        simpleShopDate.withMinute(new ShopMinute(59));
        assertThat(simpleShopDate.value()).hasMinute(59);
    }

    @Test
    public void canSetTimeToHaveCustomMinuteOf0() throws Exception {
        simpleShopDate.withMinute(new ShopMinute(0));
        assertThat(simpleShopDate.value()).hasMinute(0);
    }

    @Test
    public void canSetTimeToHaveCustomSecondOf59() throws Exception {
        simpleShopDate.withSecond(new ShopSecond(59));
        assertThat(simpleShopDate.value()).hasSecond(59);
    }

    @Test
    public void canSetTimeToHaveCustomSecondOf0() throws Exception {
        simpleShopDate.withSecond(new ShopSecond(0));
        assertThat(simpleShopDate.value()).hasSecond(0);
    }
}