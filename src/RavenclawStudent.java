public class RavenclawStudent extends HogwartsStudent{

    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressDistance, int smart, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "<< Факультет Когтевран >>    " + super.toString() +
                ", Ум =" + smart +
                ", Мудрость =" + wisdom +
                ", Остроумие =" + wit +
                ", Творчество =" + creativity;
    }
}
