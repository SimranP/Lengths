public class Compare {
    private Comparable length;

    public Compare(Comparable length) {
        this.length = length;
    }

    public boolean isGreaterThan(Comparable toBeCompare) {
        return length.convertToBase() > toBeCompare.convertToBase();
    }

    public boolean isLessThan(Comparable toBeCompare) {
        return length.convertToBase() < toBeCompare.convertToBase();
    }

    public boolean isEqual(Comparable toBeCompare) {
        return length.convertToBase() == toBeCompare.convertToBase();
    }
}
