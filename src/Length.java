public class Length {
    private double quantity;
    private LengthUnit unit;

    public Length(double quantity, LengthUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public boolean isEqual(Length length) {
        return unit.multiplyBaseFactor(quantity) == length.unit.multiplyBaseFactor(length.quantity);
    }

    public Length add(Length length) {
        return new Length(unit.divideByBaseFactor(unit.multiplyBaseFactor(quantity)+length.unit.multiplyBaseFactor(length.quantity)),unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        if (Double.compare(length.quantity, quantity) != 0) return false;
        return unit == length.unit;
    }
}
