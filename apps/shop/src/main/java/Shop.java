import java.util.Date;

public class Shop {

    private Date OPENING_HOUR;
    private Date CLOSING_HOUR;

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
