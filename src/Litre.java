public class Litre implements Comparable {
    private double value;

    public Litre(double value) {
        this.value = value;
    }

    @Override
    public int convertToBase() {
        return (int)(value*1000);
    }
}
