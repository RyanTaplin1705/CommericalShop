import person.staff.BasicStaff;
import person.staff.Staff;
import time.ShopTime;
import time.SimpleShopTime;
import time.digit.ShopHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopBuilderHelper {
    // SHOP ITEMS
    private static final Till till = new Till();
    private static final Staff staff = new BasicStaff();

    // DEFAULT SHOP
    public static final int NO_OF_DEFAULT_TILLS = 5;
    private static final List<Till> DEFAULT_TILLS = new ArrayList<>(Arrays.asList(till, till, till, till, till));

    public static final int NO_OF_DEFAULT_STAFF = 12;
    private static final List<Staff> DEFAULT_STAFF = new ArrayList<>(Arrays.asList(staff, staff, staff, staff, staff, staff, staff, staff, staff, staff, staff, staff));

    public static final ShopTime DEFAULT_OPENING = new SimpleShopTime().withHour(new ShopHour(9));
    public static final ShopTime DEFAULT_CLOSING = new SimpleShopTime().withHour(new ShopHour(18));
    public static final Shop EXPECTED_DEFAULT_SHOP = new Shop(DEFAULT_OPENING.value(), DEFAULT_CLOSING.value(), DEFAULT_TILLS, DEFAULT_STAFF);


    // CUSTOM SHOP
    public static final int NO_OF_CUSTOM_TILLS = 1;
    private static final List<Till> CUSTOM_TILLS = new ArrayList<>(Arrays.asList(till));

    public static final int NO_OF_CUSTOM_STAFF = 2;
    private static final List<Staff> CUSTOM_STAFF = new ArrayList<>(Arrays.asList(staff, staff));

    public static final ShopTime CUSTOM_OPENING = new SimpleShopTime().withHour(new ShopHour(0));
    public static final ShopTime CUSTOM_CLOSING = new SimpleShopTime().withHour(new ShopHour(23));
    public static final Shop EXPECTED_CUSTOM_SHOP = new Shop(CUSTOM_OPENING.value(), CUSTOM_CLOSING.value(), CUSTOM_TILLS, CUSTOM_STAFF);

    public Shop getDefaultShop() {
        return new ShopBuilder().build();
    }

    public Shop getCustomShop() {
        return new ShopBuilder()
                .withOpeningTime(CUSTOM_OPENING)
                .withClosingTime(CUSTOM_CLOSING)
                .withStaff(NO_OF_CUSTOM_STAFF)
                .withTills(NO_OF_CUSTOM_TILLS)
                .build();
    }
}
