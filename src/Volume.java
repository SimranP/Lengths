public class Volume {
    private double quantity;
    private VolumeUnit unit;

    public Volume(double quantity, VolumeUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public boolean isEqual(Volume volume) {
        return unit.multiplyBaseFactor(quantity) == volume.unit.multiplyBaseFactor(volume.quantity);
    }

    public Volume add(Volume volume) {
        return new Volume(unit.divideByBaseFactor(unit.multiplyBaseFactor(quantity)+volume.unit.multiplyBaseFactor(volume.quantity)),unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume volume = (Volume) o;

        if (Double.compare(volume.quantity, quantity) != 0) return false;
        return unit == volume.unit;

    }

}
