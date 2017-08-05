import time.SimpleShopTime;
import time.digit.ShopHour;
import time.digit.ShopMinute;
import time.digit.ShopSecond;

import java.util.Date;

public class Shop {

    private Date OPENING_HOUR;
    private Date CLOSING_HOUR;

    public Shop() {
        OPENING_HOUR = new SimpleShopTime().withHour(new ShopHour(9)).withMinute(new ShopMinute(0)).withSecond(new ShopSecond(0)).value();
        CLOSING_HOUR = new SimpleShopTime().withHour(new ShopHour(18)).withMinute(new ShopMinute(0)).withSecond(new ShopSecond(0)).value();
    }

    public Shop(Date SHOP_OPENING_HOUR, Date SHOP_CLOSING_HOUR) {
        this.OPENING_HOUR = SHOP_OPENING_HOUR;
        this.CLOSING_HOUR = SHOP_CLOSING_HOUR;
    }

    public Date getOpeningHour() {
        return OPENING_HOUR;
    }

    public Date getClosingHour() {
        return CLOSING_HOUR;
    }
}
