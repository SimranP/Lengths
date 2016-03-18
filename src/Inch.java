public class Inch implements Comparable {
    private int value;

    public Inch(int value) {
        this.value = value;
    }


    @Override
    public int convertToBase() {
        return value*25;
    }

    public Inch add (Inch inch){
        return new Inch(value+inch.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inch inch = (Inch) o;

        return value == inch.value;

    }
}
