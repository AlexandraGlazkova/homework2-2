import java.util.Objects;

public class Pudendum extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public void compareStudents(Pudendum studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.name + " лучше, чем " + studentSecond.name);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.name + " лучше, чем " + this.name);
        } else {
            System.out.println(this.name + "такой же как и " + studentSecond.name);
        }
    }

    public Pudendum(String name, int teleport, int magic,
                    int industriousness, int loyalty, int honesty) {
        super(name, teleport, magic);
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
        return name + " - ученик Pudenum: " +
                "industriousness = " + industriousness +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                ", teleport = " + teleport +
                ", magic = " + magic;
    }
}


