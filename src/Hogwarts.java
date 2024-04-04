public class Hogwarts {
    public void printStudent(HogwartsStudent student) {
        System.out.println(student);
    }

    public void compareAnyStudents(HogwartsStudent first, HogwartsStudent second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println("Студент " + first.getName() + " сильнее, чем " + second.getName());
        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println("Студенты " + first.getName() + " и " + second.getName() + " равны по силе");
        } else {
            System.out.println("Студент " + second.getName() + " сильнее, чем " + first.getName());
        }

        if (first.getTransgressDistance() > second.getTransgressDistance()) {
            System.out.println("Студент " + first.getName() + " трансгрессирует дальше, чем " + second.getName());
        } else if (first.getTransgressDistance() == second.getTransgressDistance()) {
            System.out.println("Студенты " + first.getName() + " и " + second.getName() + " трансгрессируют одиннаково");
        } else {
            System.out.println("Студент " + second.getName() + " трансгессирует дальше, чем " + first.getName());
        }
    }


    public void compareGryffindorStudent(GryffindorStudent first, GryffindorStudent second) {
        int firstSum = first.getHonor() + first.getBravery() + first.getNobility();
        int secondSum = second.getBravery() + second.getHonor() + second.getNobility();

        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " сильнее, чем " + second.getName());
        } else if (firstSum == secondSum) {
            System.out.println("Студенты " + first.getName() + " и " + second.getName() + " равны");
        } else {
            System.out.println("Студент " + second.getName() + " сильнее, чем " + first.getName());
        }
    }

    public void compareHufflepuffStudent(HufflepuffStudent first, HufflepuffStudent second) {
        int firstSum = first.getHardwork() + first.getHonesty() + first.getLoyalty();
        int secondSum = second.getHardwork() + second.getHonesty() + second.getLoyalty();

        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " сильнее, чем " + second.getName());
        } else if (firstSum == secondSum) {
            System.out.println("Студенты " + first.getName() + " и " + second.getName() + " равны");
        } else {
            System.out.println("Студент " + second.getName() + " сильнее, чем " + first.getName());
        }
    }

    public void compareRavenclawStudent(RavenclawStudent first, RavenclawStudent second) {
        int firstSum = first.getSmart() + first.getCreativity() + first.getWit()+ first.getWisdom();
        int secondSum = second.getSmart() + second.getCreativity() + second.getWit()+ second.getWisdom();

        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " сильнее, чем " + second.getName());
        } else if (firstSum == secondSum) {
            System.out.println("Студенты " + first.getName() + " и " + second.getName() + " равны");
        } else {
            System.out.println("Студент " + second.getName() + " сильнее, чем " + first.getName());
        }
    }

    public void compareSlytherinStudent(SlytherinStudent first, SlytherinStudent second) {
        int firstSum = first.getAmbition() + first.getDetermination() + first.getDominance()+ first.getResourcefulness()+ first.getTrick();
        int secondSum = second.getAmbition() + second.getDetermination() + second.getDominance()+ second.getResourcefulness()+ second.getTrick();
        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " сильнее, чем " + second.getName());
        } else if (firstSum == secondSum) {
            System.out.println("Студенты " + first.getName() + " и " + second.getName() + " равны");
        } else {
            System.out.println("Студент " + second.getName() + " сильнее, чем " + first.getName());
        }
    }
}
