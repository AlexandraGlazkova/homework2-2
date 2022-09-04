import java.util.Objects;

public class Genevra extends hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public Genevra(String name, int theDistanceOfTheTransgression, int thePowerOfMagic,
                   int mind, int wisdom, int wit, int creative) {
        super(name, theDistanceOfTheTransgression, thePowerOfMagic);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Genevra{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creative=" + creative +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genevra genevra = (Genevra) o;
        return mind == genevra.mind && wisdom == genevra.wisdom && wit == genevra.wit && creative == genevra.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mind, wisdom, wit, creative);
    }
}

