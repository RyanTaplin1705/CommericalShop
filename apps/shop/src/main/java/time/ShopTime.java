package time;

import time.digit.ShopHour;
import time.digit.ShopMinute;
import time.digit.ShopSecond;

import java.util.Date;

public interface ShopTime {

    ShopTime withHour(ShopHour hour);

    ShopTime withMinute(ShopMinute minute);

    ShopTime withSecond(ShopSecond second);

    Date value();
}
