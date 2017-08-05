package time.digit;

public class ShopMinute extends ShopTimeDigit {

    public ShopMinute(int value) {
        super(value);
    }

    @Override
    public int getMinValue() {
        return 0;
    }

    @Override
    public int getMaxValue() {
        return 59;
    }

}
