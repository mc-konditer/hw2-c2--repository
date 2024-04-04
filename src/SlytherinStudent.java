public class SlytherinStudent extends HogwartsStudent{

    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int dominance;

    public SlytherinStudent(String name, int magicPower, int transgressDistance, int trick, int determination, int ambition, int resourcefulness, int dominance) {
        super(name, magicPower, transgressDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.dominance = dominance;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
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

    public int getDominance() {
        return dominance;
    }

    public void setDominance(int dominance) {
        this.dominance = dominance;
    }

    public String toString() {
        return "<< Факультет Слизерин >>     " + super.toString() +
                ", Хитрость = " + trick +
                ", Решительность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + dominance;
    }
}
