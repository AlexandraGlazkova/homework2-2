import java.util.Objects;

public abstract class Hogwarts {
    String name;
    int teleport;
    int magic;

    public void compareStudents (Hogwarts studentSecond){
     int powerOne = this.teleport+this.magic;
     int powerTwo= studentSecond.teleport+studentSecond.magic;
     if (powerOne>powerTwo){
         System.out.println( this.name + " обладает большей мощностью магии, чем "+ studentSecond.name);
     } else if (powerOne< powerTwo){
         System.out.println(studentSecond.name + " обладает большей мощностью магии, чем "+ this.name);
     }else{
         System.out.println(this.name + "обладает такой же мощностью магии, что и " + studentSecond.name);
     }
    }
    public Hogwarts(String name, int teleport, int magic) {
        this.name = name;
        this.teleport = teleport;
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public int getTeleport() {
       return teleport;
    }

    public int getMagic() {

        return magic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeleport(int teleport) {
        if (teleport>0 || teleport<100){
            throw new RuntimeException("Значение неверно");
        }
    }

    public void setMagic(int magic) {
        if (teleport>0 || teleport<100){
            throw new RuntimeException("Значение неверно");
        };
    }


}
