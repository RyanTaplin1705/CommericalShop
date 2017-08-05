import org.junit.Test;
import time.SimpleShopTime;
import time.digit.ShopHour;
import time.digit.ShopMinute;
import time.digit.ShopSecond;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    private Shop shop;

    private static final Date DEFAULT_CLOSING = new SimpleShopTime().withHour(new ShopHour(18)).value();
    private static final Date DEFAULT_OPENING = new SimpleShopTime().withHour(new ShopHour(9)).value();

    private static final Date CUSTOM_OPENING = new SimpleShopTime().withHour(new ShopHour(0)).withMinute(new ShopMinute(0)).withSecond(new ShopSecond(0)).value();
    private static final Date CUSTOM_CLOSING =  new SimpleShopTime().withHour(new ShopHour(23)).withMinute(new ShopMinute(59)).withSecond(new ShopSecond(59)).value();


    @Test
    public void shopHasDefaultHoursOf9hrTo18hr() throws Exception {
        givenDefaultShop();
        assertThat(shop.getOpeningHour()).isEqualTo(DEFAULT_OPENING);
        assertThat(shop.getClosingHour()).isEqualTo(DEFAULT_CLOSING);
    }

    @Test
    public void shopCanHaveCustomHoursOf0To23() throws Exception {
        givenCustomShop();
        assertThat(shop.getOpeningHour()).isEqualTo(CUSTOM_OPENING);
        assertThat(shop.getClosingHour()).isEqualTo(CUSTOM_CLOSING);
    }

    private void givenCustomShop() {
        shop = new Shop(CUSTOM_OPENING, CUSTOM_CLOSING);
    }

    private void givenDefaultShop() {
        shop = new Shop();
    }


}