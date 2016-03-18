public class Millimeter implements Comparable {
    private int value;

    public Millimeter(int value) {
        this.value = value;
    }


    @Override
    public int convertToBase() {
        return value;
    }
}
