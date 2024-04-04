public class HogwartsStudent {

    private String name;
    private int magicPower;
    private int transgressDistance;

    public HogwartsStudent(String name, int magicPower, int transgressDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    @Override
    public String toString() {
        return  "Имя студента: " + name +
                ", Магическая мощь = " + magicPower +
                ", Дистанция трансгрессии = " + transgressDistance;
    }
}
