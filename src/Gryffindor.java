import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public void compareStudents (Gryffindor studentSecond){
        int powerOne = this.nobility+this.honor+this.bravery;
        int powerTwo= studentSecond.nobility+studentSecond.honor+studentSecond.bravery;
        if (powerOne > powerTwo){
            System.out.println( this.name + " лучший Гриффиндорец, чем "+ studentSecond.name);
        } else if (powerOne < powerTwo){
            System.out.println(studentSecond.name + " лучший Гриффиндорец, чем "+ this.name);
        }else{
            System.out.println(this.name + "такой же Гриффиндорец, как и " + studentSecond.name);
        }
    }
    public Gryffindor (String name, int teleport, int magic, int nobility, int honor, int bravery) {
        super (name, teleport, magic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
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
        return name + "- ученик Griffinor: "+
                "nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery +
                ", teleport = " + teleport +
                ", magic = " + magic;
    }
}


