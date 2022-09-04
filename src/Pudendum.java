import java.util.Objects;

public class Pudendum extends hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Pudendum(String name, int theDistanceOfTheTransgression, int thePowerOfMagic,
                    int industriousness, int loyalty, int honesty) {
        super (name, theDistanceOfTheTransgression, thePowerOfMagic);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Pudendum{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pudendum pudendum = (Pudendum) o;
        return industriousness == pudendum.industriousness && loyalty == pudendum.loyalty && honesty == pudendum.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(industriousness, loyalty, honesty);
    }
}
