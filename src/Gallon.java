public class Gallon implements Comparable {
    private int value;

    public Gallon(int value) {
        this.value = value;
    }

    @Override
    public int convertToBase() {
        return value * 3780;
    }
}
