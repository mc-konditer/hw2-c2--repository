public class Main {
    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts();

        GryffindorStudent harry = new GryffindorStudent("Гарри Поттер", 88, 73,90,69,99);
        GryffindorStudent hermione  = new GryffindorStudent("Гермиона Грейнджер", 64, 76,63,78, 80);
        GryffindorStudent ron  = new GryffindorStudent("Рон Уизли", 71, 65,68,76, 77);

        HufflepuffStudent cedric = new HufflepuffStudent("Седрик Диггори", 64, 42, 67, 72, 51);
        HufflepuffStudent zacharia = new HufflepuffStudent("Захария Смит", 52, 38, 59, 70, 55);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 50, 43, 54, 81, 48);

        SlytherinStudent draco = new SlytherinStudent("Драко Малфой", 63, 81, 38, 35, 41, 29, 50);
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл", 57, 68, 30, 29, 49, 43, 39);
        SlytherinStudent grahan = new SlytherinStudent("Грэхэм Монтегю", 61, 73, 35, 39, 51, 33, 44);

        RavenclawStudent zhou = new RavenclawStudent("Чжоу Чанг", 65, 68, 48, 52, 39, 47);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 61, 59, 56, 42, 48, 57);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 58, 70, 46, 49, 37, 40);

        hogwarts.printStudent(harry);
        hogwarts.printStudent(zacharia);
        hogwarts.printStudent(grahan);
        hogwarts.printStudent(padma);

        hogwarts.compareAnyStudents(grahan,draco);

        hogwarts.compareGryffindorStudent(ron, hermione);

        hogwarts.compareHufflepuffStudent(cedric, justin);

        hogwarts.compareRavenclawStudent(marcus, zhou);

        hogwarts.compareSlytherinStudent(gregory, draco);



    }


}