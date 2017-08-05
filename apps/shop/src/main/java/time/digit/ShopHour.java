package time.digit;

public class ShopHour extends ShopTimeDigit {

    public ShopHour(int value) {
        super(value);
    }

    @Override
    public int getMinValue() {
        return 0;
    }

    @Override
    public int getMaxValue() {
        return 23;
    }
}
