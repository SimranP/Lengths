public class Centimeter implements Comparable {
    private int value;

    public Centimeter(int value) {
        this.value = value;
    }

    @Override
    public int convertToBase() {
        return value*10;
    }
}
