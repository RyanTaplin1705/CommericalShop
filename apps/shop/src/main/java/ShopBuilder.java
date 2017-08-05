import time.ShopTime;
import time.SimpleShopTime;
import time.digit.ShopHour;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopBuilder {

    private Date openingTime;
    private Date closingTime;
    private int noOfTills;
    private int noOfStaff;

    public ShopBuilder() {
        openingTime = new SimpleShopTime().withHour(new ShopHour(9)).value();
        closingTime = new SimpleShopTime().withHour(new ShopHour(18)).value();
        noOfTills = 5;
        noOfStaff = 12;
    }

    public ShopBuilder withOpeningTime(ShopTime time) {
        this.openingTime = time.value();
        return this;
    }

    public ShopBuilder withClosingTime(ShopTime time) {
        this.closingTime = time.value();
        return this;
    }

    public ShopBuilder withTills(int noOfTills) {
        this.noOfTills = noOfTills;
        return this;
    }

    public ShopBuilder withStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
        return this;
    }

    public Shop build() {
        return new Shop(openingTime, closingTime, createTills(noOfTills), createStaff(noOfStaff));
    }

    private List<Staff> createStaff(int noOfStaff) {
        List<Staff> staff = new ArrayList<>();
        for(int i = 0; i < noOfStaff; i++) {
            staff.add(new Staff());
        }
        return staff;
    }

    private List<Till> createTills(int noOfTills) {
        List<Till> tills = new ArrayList<>();
        for(int i = 0; i < noOfTills; i++) {
            tills.add(new Till());
        }
        return tills;
    }
}
