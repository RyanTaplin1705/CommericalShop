import time.ShopTime;
import time.SimpleShopTime;
import time.digit.ShopHour;

import java.util.Date;

public class ShopBuilder {

    private Shop shop;

    private Date openingTime;
    private Date closingTime;

    public ShopBuilder() {
        openingTime = new SimpleShopTime().withHour(new ShopHour(9)).value();
        closingTime = new SimpleShopTime().withHour(new ShopHour(18)).value();
    }

    public ShopBuilder withOpeningTime(ShopTime time) {
        this.openingTime = time.value();
        return this;
    }

    public ShopBuilder withClosingTime(ShopTime time) {
        this.closingTime = time.value();
        return this;
    }

    public Shop build() {
        return new Shop(openingTime, closingTime);
    }

}
