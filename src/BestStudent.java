public class BestStudent {
    public static void sumBall(Gryffindor[] gryffindors) {
        int[] sum = new int[gryffindors.length];
        for (int i = 0; i < gryffindors.length; i++) {
            sum[i] += gryffindors[i].getNobly() + gryffindors[i].getBravery() + gryffindors[i].getHonor();
            System.out.println(sum[i]);
        }
    }
    public static void sumBall(Pudendum[] pudendums) {
        int [] sum = new int[pudendums.length];
        for (int i = 0; i < pudendums.length; i++) {
            sum[i] += pudendums[i].getHonesty() + pudendums[i].getIndustriousness() + pudendums[i].getLoyalty();
            System.out.println(sum[i]);
        }

    }
    public static void sumBall(Genevra[] genevras) {
        int [] sum = new int[genevras.length];
        for (int i = 0; i < genevras.length; i++) {
            sum[i] += genevras[i].getCreative() + genevras[i].getMind() + genevras[i].getWisdom()+genevras[i].getWit();
            System.out.println(sum[i]);
        }

    }
    public static void sumBall(Slenderize[] slenderizes) {
        int [] sum = new int[slenderizes.length];
        for (int i = 0; i < slenderizes.length; i++) {
            sum[i] += slenderizes[i].getAmbition() + slenderizes[i].getDetermination()
                    + slenderizes[i].getLustForPower()+slenderizes[i].getResourcefulness()+slenderizes[i].getTheTrick();
            System.out.println(sum[i]);
        }

    }
    public static void sumBall(hogwarts[]students) {
        int [] sum = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            sum[i] += students[i].getTheDistanceOfTheTransgression() + students[i].getThePowerOfMagic();
            System.out.println(sum[i]);
        }

    }
}
