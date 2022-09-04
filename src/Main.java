public class Main {

    public static void main(String[] args) {
        hogwarts[]students = {
                new hogwarts("Harry Potter", 50, 40),
                new hogwarts ("Hermione Granger", 48, 38),
                new hogwarts("Ron Weasley", 45, 26),
                new hogwarts ("Zachariah Smith", 45, 26),
                new hogwarts ("Cedric Diggory", 43, 19),
                new hogwarts ("Justin Finch-Fletchley", 42, 16),
                new hogwarts ("Zhou Chang", 42, 26),
                new hogwarts ("Padma Patil", 41, 29),
                new hogwarts ("Marcus Belby", 40, 40),
                new hogwarts("Draco Malfoy", 49, 15),
                new hogwarts ("Graham Montague", 60, 13),
                new hogwarts ("Грегори Гойл", 55, 53),

        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 50, 40, 21, 23, 6),
                new Gryffindor("Hermione Granger", 48, 38, 20, 19, 5),
                new Gryffindor("Ron Weasley", 45, 26, 17, 14, 5),
        };
        Pudendum[] pudendums = {
                new Pudendum("Zachariah Smith", 45, 26, 19, 18, 17),
                new Pudendum("Cedric Diggory", 43, 19, 16, 14, 12),
                new Pudendum("Justin Finch-Fletchley", 42, 16, 10, 15, 19),
        };
        Genevra[] genevras = {
                new Genevra("Zhou Chang", 42, 26, 19, 18, 16, 12),
                new Genevra("Padma Patil", 41, 29, 15, 16, 18, 16),
                new Genevra("Marcus Belby", 40, 40, 15, 30, 17, 16),

        };
        Slenderize[] slenderizes = {
                new Slenderize("Draco Malfoy", 49, 15, 18, 19, 7, 9, 60),
                new Slenderize("Graham Montague", 60, 13, 18, 60, 20, 18, 20),
                new Slenderize("Грегори Гойл", 55, 53, 15, 32, 41, 15, 23),
        };
        PrintStudents printStudents = new PrintStudents();
        printStudents.print(students);
        printStudents.print(gryffindors);
        printStudents.print(pudendums);
        printStudents.print(genevras);
        printStudents.print(slenderizes);



    }

}