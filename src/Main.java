public class Main {
    public static void main(String[] args) {
        Human Maksim = new Human(1987, "Максим", "Минск", "бренд менеджером");
        Human Ania = new Human(1993, "Аня", "Москва", "методистом");
        Human Katia = new Human(1994, "Катя", "калининград", "продакт менеджером");
        Human Artiem = new Human(1995, "Артём", "Москва", "директором по развитию бизнеса");
        Human Vladimir = new Human(2001, "Влвдимир", "Казань", null);

        Maksim.Human();
        Ania.Human();
        Katia.Human();
        Artiem.Human();
        Vladimir.Human();

        System.out.println();
        Flower Roza = new Flower("роза обыкновенная", "Голландия", 35.59, 0);
        Flower Hrizantema = new Flower("хризантема", null, 15, 5);
        Flower Pion = new Flower("пион", null, 69.9, 1);
        Flower Gipsofila = new Flower("гипсофила", "Турция", 19.5, 10);

        Roza.properties();
        Hrizantema.properties();
        Pion.properties();
        Gipsofila.properties();

        double[] flowers = new double[2];
        flowers[0] = Roza.getCost();
        flowers[1] = Hrizantema.getCost();
        flowers[2] = Pion.getCost();



    }

}