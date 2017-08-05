import org.junit.Test;
import time.ShopTime;
import time.SimpleShopTime;
import time.digit.ShopHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopBuilderTest {

    private ShopBuilder shopBuilder = new ShopBuilder();


    // SHOP ITEMS
    private static final Till till = new Till();
    private static final Staff staff = new Staff();

    // DEFAULT SHOP
    private static final int NO_OF_DEFAULT_TILLS = 5;
    private static final List<Till> DEFAULT_TILLS = new ArrayList<>(Arrays.asList(till, till, till, till, till));

    private static final int NO_OF_DEFAULT_STAFF = 12;
    private static final List<Staff> DEFAULT_STAFF = new ArrayList<>(Arrays.asList(staff, staff, staff, staff, staff, staff, staff, staff, staff, staff, staff, staff));

    private static final Date DEFAULT_OPENING = new SimpleShopTime().withHour(new ShopHour(9)).value();
    private static final Date DEFAULT_CLOSING = new SimpleShopTime().withHour(new ShopHour(18)).value();
    private static final Shop EXPECTED_DEFAULT_SHOP = new Shop(DEFAULT_OPENING, DEFAULT_CLOSING, DEFAULT_TILLS, DEFAULT_STAFF);


    // CUSTOM SHOP
    private static final int NO_OF_CUSTOM_TILLS = 1;
    private static final List<Till> CUSTOM_TILLS = new ArrayList<>(Arrays.asList(till));

    private static final int NO_OF_CUSTOM_STAFF = 2;
    private static final List<Staff> CUSTOM_STAFF = new ArrayList<>(Arrays.asList(staff, staff));

    private static final ShopTime CUSTOM_OPENING = new SimpleShopTime().withHour(new ShopHour(0));
    private static final ShopTime CUSTOM_CLOSING = new SimpleShopTime().withHour(new ShopHour(23));
    private static final Shop EXPECTED_CUSTOM_SHOP = new Shop(CUSTOM_OPENING.value(), CUSTOM_CLOSING.value(), CUSTOM_TILLS, CUSTOM_STAFF);

    @Test
    public void defaultShopBuilder() throws Exception {
        Shop actualShop = shopBuilder.build();
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

    private Shop getCustomShop() {
        return shopBuilder
                .withOpeningTime(CUSTOM_OPENING)
                .withClosingTime(CUSTOM_CLOSING)
                .withStaff(NO_OF_CUSTOM_STAFF)
                .withTills(NO_OF_CUSTOM_TILLS)
                .build();
    }
}