package time.digit;

public abstract class ShopTimeDigit {

    private int value;

    ShopTimeDigit(int value) {
        this.value = validate(value);
    }

    private int validate(int value) {
        if (value < getMinValue()) {
            return getMinValue();
        } else if (value > getMaxValue()) {
            return getMaxValue();
        }
        return value;
    }

    public abstract int getMinValue();

    public abstract int getMaxValue();

    public int value() {
        return this.value;
    }
}
