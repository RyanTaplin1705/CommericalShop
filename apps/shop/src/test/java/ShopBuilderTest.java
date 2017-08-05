import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopBuilderTest extends ShopBuilderHelper {

    @Test
    public void defaultShopBuilder() throws Exception {
        Shop actualShop = getDefaultShop();
        assertThat(actualShop.openingHour).isEqualTo(EXPECTED_DEFAULT_SHOP.openingHour);
        assertThat(actualShop.closingHour).isEqualTo(EXPECTED_DEFAULT_SHOP.closingHour);

        assertThat(actualShop.tills.size()).isEqualTo(EXPECTED_DEFAULT_SHOP.tills.size());
        assertThat(actualShop.tills.size()).isEqualTo(NO_OF_DEFAULT_TILLS);

        assertThat(actualShop.staff.size()).isEqualTo(EXPECTED_DEFAULT_SHOP.staff.size());
        assertThat(actualShop.staff.size()).isEqualTo(NO_OF_DEFAULT_STAFF);
    }

    @Test
    public void customShopBuilder() throws Exception {
        Shop actualShop = getCustomShop();
        assertThat(actualShop.openingHour).isEqualTo(EXPECTED_CUSTOM_SHOP.openingHour);
        assertThat(actualShop.closingHour).isEqualTo(EXPECTED_CUSTOM_SHOP.closingHour);

        assertThat(actualShop.tills.size()).isEqualTo(EXPECTED_CUSTOM_SHOP.tills.size());
        assertThat(actualShop.tills.size()).isEqualTo(NO_OF_CUSTOM_TILLS);

        assertThat(actualShop.staff.size()).isEqualTo(EXPECTED_CUSTOM_SHOP.staff.size());
        assertThat(actualShop.staff.size()).isEqualTo(NO_OF_CUSTOM_STAFF);
    }
}