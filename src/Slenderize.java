import java.util.Objects;

public class Slenderize extends hogwarts{

    private int theTrick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

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
        return "Slenderize{" +
                "theTrick=" + theTrick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slenderize that = (Slenderize) o;
        return theTrick == that.theTrick && determination == that.determination && ambition == that.ambition && resourcefulness == that.resourcefulness && lustForPower == that.lustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(theTrick, determination, ambition, resourcefulness, lustForPower);
    }
}
