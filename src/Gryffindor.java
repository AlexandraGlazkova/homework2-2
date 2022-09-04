import java.util.Objects;

public class Gryffindor extends hogwarts {
    private int nobly;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int theDistanceOfTheTransgression, int thePowerOfMagic,
                      int nobly, int honor, int bravery) {
        super(name, theDistanceOfTheTransgression, thePowerOfMagic);
        this.nobly = nobly;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobly() {
        return nobly;
    }

    public void setNobly(int nobly) {
        this.nobly = nobly;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobly=" + nobly +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobly == that.nobly && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobly, honor, bravery);
    }
}