public class Feet implements Comparable {
    private int value;

    public Feet(int value) {
        this.value = value;
    }

    @Override
    public int convertToBase() {
        return value*12*25;
    }
}
