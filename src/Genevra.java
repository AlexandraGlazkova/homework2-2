import java.util.Objects;

public class Genevra extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public void compareStudents(Genevra studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit + this.creative;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creative;
        if (powerOne > powerTwo) {
            System.out.println(this.name + " лучше, чем " + studentSecond.name);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.name + " лучше, чем " + this.name);
        } else {
            System.out.println(this.name + "такой же как и " + studentSecond.name);
        }
    }
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
        return name + " - ученик Genevra:" +
                "mind = " + mind +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creative = " + creative +
                ", teleport = " + teleport +
                ", magic = " + magic;
    }
}

