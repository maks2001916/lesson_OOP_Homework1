public class Bouquet {

        private Flower[] flowers;

        public Bouquet(int index) {
            flowers = new Flower[index];
        }

    public void broadcast(Flower flower) {
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] == null) {
                flowers[i] = flower;
                return;
            }
        }
    }

    public void conclusion() {


        System.out.println("Букет простоит " + getExpiryDays() + " дней");
        System.out.println("Букет стоит " + getCost() + " руб.");
    }

    public int getExpiryDays() {
        int i = 0;
        for (i = 0; i < flowers.length; i++) {
            if (flowers[i].lifeSpat < i) {
                i = flowers[i].lifeSpat;
            }
        }
        return i;
    }

    public double getCost() {
        int i = 0;
        for (i = 0; i < flowers.length; i++) {
            i += flowers[i].cost;
        }
        return i;
    }
}

