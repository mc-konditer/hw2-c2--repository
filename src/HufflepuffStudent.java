public class HufflepuffStudent extends HogwartsStudent{

    private int honesty;
    private int loyalty;
    private int hardwork;

    public HufflepuffStudent(String name, int magicPower, int transgressDistance, int honesty, int loyalty, int hardwork) {
        super(name, magicPower, transgressDistance);
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.hardwork = hardwork;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }

    @Override
    public String toString() {
        return "<< Факультет Пуффендуй >>    " + super.toString() +
                ", Честь = " + honesty +
                ", Верность = " + loyalty +
                ", Трудолюбие = " + hardwork;
    }
}
