public enum VolumeUnit {
    Gallon(3780),
    Litre(1000);

    private final double baseFactor;

    VolumeUnit(double baseFactor) {
        this.baseFactor = baseFactor;
    }

    public double multiplyBaseFactor(double quantity){
        return quantity* baseFactor;
    }

    public double divideByBaseFactor(double quantity) {
        return quantity/baseFactor;
    }
}
