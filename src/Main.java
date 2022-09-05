public class Main {

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 50, 40,
                21, 23, 13);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 48,
                38, 20, 19, 15);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 45, 26,
                17, 14, 15);
        Pudendum zachariahSmith = new Pudendum("Zachariah Smith", 45, 26,
                19, 18, 17);
        Pudendum cedricDiggory = new Pudendum("Cedric Diggory", 43, 19,
                16, 14, 12);
        Pudendum justinFinchFletchley = new Pudendum("Justin Finch-Fletchley", 42,
                16, 10, 15, 19);
        Genevra zhouChang = new Genevra("Zhou Chang", 42, 26, 19,
                18, 16, 12);
        Genevra padmaPatil = new Genevra("Marcus Belby", 40, 40, 15,
                30, 17, 16);
        Genevra marcusBelby = new Genevra("Marcus Belby", 40, 40, 15,
                30, 17, 16);
        Slenderize dracoMalfoy = new Slenderize("Draco Malfoy", 49, 15,
                18, 19, 7, 9, 60);
        Slenderize grahamMontague = new Slenderize("Graham Montague", 60, 13,
                18, 60, 20, 18, 20);
        Slenderize gregoryGoyle = new Slenderize("Gregory Goyle", 55, 53,
                15, 32, 41, 15, 23);

        System.out.println(harryPotter);
        harryPotter.compareStudents(hermioneGranger);
        marcusBelby.compareStudents(gregoryGoyle);
        grahamMontague.compareStudents(dracoMalfoy);
    }





}