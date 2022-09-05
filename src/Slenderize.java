import java.util.Objects;

public class Slenderize extends Hogwarts{

    private int theTrick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public void compareStudents(Slenderize studentSecond) {
        int powerOne = this.theTrick + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int powerTwo = studentSecond.theTrick + studentSecond.determination + studentSecond.ambition +
                studentSecond.resourcefulness + studentSecond.lustForPower;
        if (powerOne > powerTwo) {
            System.out.println(this.name + " лучше, чем " + studentSecond.name);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.name + " лучше, чем " + this.name);
        } else {
            System.out.println(this.name + "такой же как и " + studentSecond.name);
        }
    }
    public Slenderize(String name, int theDistanceOfTheTransgression, int thePowerOfMagic, int theTrick,
                      int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, theDistanceOfTheTransgression, thePowerOfMagic);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return name + " - ученик Slenderize: " +
                "theTrick = " + theTrick +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower +
                ", teleport = " + teleport +
                ", magic = " + magic;
    }

}

