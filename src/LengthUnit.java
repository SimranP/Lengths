public enum LengthUnit {
    Feet(300),
    Inch(25),
    Centimeter(10),
    Millimeter(1);

    private final double baseFactor;

    LengthUnit(double baseFactor) {
        this.baseFactor = baseFactor;
    }

    public double multiplyBaseFactor(double quantity){
        return quantity*baseFactor;
    }

    public double divideByBaseFactor(double quantity) {
        return quantity/baseFactor;
    }
}
