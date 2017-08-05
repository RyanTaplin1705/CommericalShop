import org.junit.Test;
import time.ShopTime;
import time.SimpleShopTime;
import time.digit.ShopHour;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopBuilderTest {

    private ShopBuilder shopBuilder = new ShopBuilder();

    private static final Date DEFAULT_OPENING = new SimpleShopTime().withHour(new ShopHour(9)).value();
    private static final Date DEFAULT_CLOSING = new SimpleShopTime().withHour(new ShopHour(18)).value();
    private static final Shop EXPECTED_DEFAULT_SHOP = new Shop(DEFAULT_OPENING, DEFAULT_CLOSING);

    private static final ShopTime CUSTOM_OPENING = new SimpleShopTime().withHour(new ShopHour(0));
    private static final ShopTime CUSTOM_CLOSING = new SimpleShopTime().withHour(new ShopHour(23));
    private static final Shop EXPECTED_CUSTOM_SHOP = new Shop(CUSTOM_OPENING.value(), CUSTOM_CLOSING.value());

    @Test
    public void defaultShopBuilder() throws Exception {
        Shop actualShop = shopBuilder.build();
        assertThat(actualShop.getOpeningHour()).isEqualTo(EXPECTED_DEFAULT_SHOP.getOpeningHour());
        assertThat(actualShop.getClosingHour()).isEqualTo(EXPECTED_DEFAULT_SHOP.getClosingHour());
    }

    @Test
    public void customShopBuilder() throws Exception {
        Shop actualShop = shopBuilder.withOpeningTime(CUSTOM_OPENING).withClosingTime(CUSTOM_CLOSING).build();
        assertThat(actualShop.getOpeningHour()).isEqualTo(EXPECTED_CUSTOM_SHOP.getOpeningHour());
        assertThat(actualShop.getClosingHour()).isEqualTo(EXPECTED_CUSTOM_SHOP.getClosingHour());
    }
}