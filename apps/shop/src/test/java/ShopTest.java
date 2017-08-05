import org.junit.Before;
import org.junit.Test;
import time.SimpleShopTime;
import time.digit.ShopHour;
import time.digit.ShopMinute;
import time.digit.ShopSecond;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    private ShopBuilder shopBuilder;
    private Shop shop;

    private static final Date DEFAULT_CLOSING = new SimpleShopTime().withHour(new ShopHour(18)).value();
    private static final Date DEFAULT_OPENING = new SimpleShopTime().withHour(new ShopHour(9)).value();

    private static final ShopHour CUSTOM_MIN_HOUR = new ShopHour(0);
    private static final ShopMinute CUSTOM_MIN_MINUTE = new ShopMinute(0);
    private static final ShopSecond CUSTOM_MIN_SECOND = new ShopSecond(0);

    private static final SimpleShopTime CUSTOM_OPENING = new SimpleShopTime()
            .withHour(CUSTOM_MIN_HOUR).withMinute(CUSTOM_MIN_MINUTE).withSecond(CUSTOM_MIN_SECOND);

    private static final ShopHour CUSTOM_MAX_HOUR = new ShopHour(23);
    private static final ShopMinute CUSTOM_MAX_MINUTE = new ShopMinute(59);
    private static final ShopSecond CUSTOM_MAX_SECOND = new ShopSecond(59);

    private static final SimpleShopTime CUSTOM_CLOSING = new SimpleShopTime()
            .withHour(CUSTOM_MAX_HOUR).withMinute(CUSTOM_MAX_MINUTE).withSecond(CUSTOM_MAX_SECOND);


    @Before
    public void setUp() throws Exception {
        shopBuilder = new ShopBuilder();
    }

    @Test
    public void shopHasDefaultHoursOf9hrTo18hr() throws Exception {
        givenDefaultShop();
        assertThat(shop.openingHour).isEqualTo(DEFAULT_OPENING);
        assertThat(shop.closingHour).isEqualTo(DEFAULT_CLOSING);
    }

    @Test
    public void shopCanHaveCustomHoursOf0To23() throws Exception {
        givenCustomShop();
        assertThat(shop.openingHour).isEqualTo(CUSTOM_OPENING);
        assertThat(shop.closingHour).isEqualTo(CUSTOM_CLOSING);
    }

    private void givenCustomShop() {
        shop = shopBuilder.withOpeningTime(CUSTOM_OPENING).withClosingTime(CUSTOM_CLOSING).build();
    }

    private void givenDefaultShop() {
        shop = shopBuilder.build();
    }
}