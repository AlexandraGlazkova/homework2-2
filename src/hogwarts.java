import java.util.Objects;

public class hogwarts {
    private String name;
    private int theDistanceOfTheTransgression;
    private int thePowerOfMagic;

    public hogwarts(String name, int theDistanceOfTheTransgression, int thePowerOfMagic) {
        this.name = name;
        this.theDistanceOfTheTransgression = theDistanceOfTheTransgression;
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public String getName() {
        return name;
    }

    public int getTheDistanceOfTheTransgression() {
        return theDistanceOfTheTransgression;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheDistanceOfTheTransgression(int theDistanceOfTheTransgression) {
        this.theDistanceOfTheTransgression = theDistanceOfTheTransgression;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    @Override
    public String toString() {
        return "hogwarts{" +
                "Имя ученика - "+ name +
                ", Расстояние трансгрессии - " + theDistanceOfTheTransgression +
                ", Сила магии - " + thePowerOfMagic+'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hogwarts hogwarts = (hogwarts) o;
        return theDistanceOfTheTransgression == hogwarts.theDistanceOfTheTransgression && thePowerOfMagic == hogwarts.thePowerOfMagic && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, theDistanceOfTheTransgression, thePowerOfMagic);
    }
}
