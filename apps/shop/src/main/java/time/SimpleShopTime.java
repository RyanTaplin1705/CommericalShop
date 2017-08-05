package time;

import time.digit.ShopHour;
import time.digit.ShopMinute;
import time.digit.ShopSecond;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleShopTime implements ShopTime {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public SimpleShopTime withHour(ShopHour hour) {
            this.hours = hour.value();
        return this;
    }

    public SimpleShopTime withMinute(ShopMinute minute) {
            this.minutes = minute.value();
        return this;
    }

    public SimpleShopTime withSecond(ShopSecond second) {
        this.seconds = second.value();
        return this;
    }

    public Date value() {
        try {
            return new SimpleDateFormat("hh:mm:ss").parse(createTime());
        } catch (ParseException e) {
            System.out.print("Unable to create time: " + createTime());
        }
        return null;
    }

    private String createTime() {
        return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);
    }

    private String pad(int time) {
        if (time > 9) return String.valueOf(time);
        else return  "0" + String.valueOf(time);
    }
}
