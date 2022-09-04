public class PrintStudents {
    public void print(hogwarts[]students) {
        System.out.println("Количесто учеников " + students.length);
        for (int i = 0; i < students.length; i++) {
            hogwarts hogwarts = students[i];
            System.out.println("hogwarts{" +
                    "Имя ученика - " + hogwarts.getName() +
                    ", Расстояние трансгрессии - " + hogwarts.getTheDistanceOfTheTransgression() +
                    ", Сила магии - " + hogwarts.getThePowerOfMagic()+'}');
        }
    }
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Количество учеников " + gryffindors.length);
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Gryffindor{" +
                    "Имя ученика - " + gryffindor.getName() +
                    ", Расстояние трансгрессии - " + gryffindor.getTheDistanceOfTheTransgression() +
                    ", Сила магии - " + gryffindor.getThePowerOfMagic() +
                    ", благородство - " + gryffindor.getNobly() +
                    ", честь - " + gryffindor.getHonor() +
                    ", храбрость- " + gryffindor.getBravery() +
                    '}');
        }
    }
    public void print (Pudendum[] pudendums) {
        System.out.println("Количество учеников " + pudendums.length);
        for (int i = 0; i < pudendums.length; i++) {
            Pudendum pudendum=pudendums[i];
            System.out.println("Pudendum{" +
                    "Имя ученика - " + pudendum.getName() +
                    ", Расстояние трансгрессии - " + pudendum.getTheDistanceOfTheTransgression() +
                    ", Сила магии - " + pudendum.getThePowerOfMagic() +
                    ", Трудолюбие - " + pudendum.getIndustriousness() +
                    ", Верность - " + pudendum.getLoyalty() +
                    ", Честность - " + pudendum.getHonesty() +
                    '}');
        }
    }
    public void print (Genevra[] genevras) {
        System.out.println("Количество учеников "+ genevras.length);
        for (int i = 0; i < genevras.length; i++) {
            Genevra genevra = genevras[i];
                System.out.println("Genevra{" +
                        "Имя ученика - " + genevra.getName()  +
                        ", Расстояние трансгрессии - " + genevra.getTheDistanceOfTheTransgression() +
                        ", Сила магии - " + genevra.getThePowerOfMagic() +
                        ", Ум - " + genevra.getMind() +
                        ", Мудрость - " + genevra.getWisdom() +
                        ", Остроумие - " + genevra.getWit() +
                        ", Творчество - " + genevra.getCreative() +
                        '}');
            }
        }
        public void print (Slenderize[] slenderizes) {
            System.out.println("Количество учеников " + slenderizes.length);
            for (int i = 0; i < slenderizes.length; i++) {
                Slenderize slenderize = slenderizes[i];
                System.out.println("Slenderize{" +
                        "Имя ученика - " + slenderize.getName() +
                        ", Расстояние трансгрессии - " + slenderize.getTheDistanceOfTheTransgression() +
                        ", Сила магии - " + slenderize.getThePowerOfMagic() +
                        ", Хитрость - " + slenderize.getTheTrick() +
                        ", Решительность - " + slenderize.getDetermination() +
                        ", Амбициозность - " + slenderize.getAmbition()+
                        ", Находчивость - " + slenderize.getResourcefulness() +
                        ", Жажда власти - " + slenderize.getLustForPower() +
                        '}');
            }
        }
}
