package time.digit;

public class ShopSecond extends ShopTimeDigit {

    public ShopSecond(int value) {
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
