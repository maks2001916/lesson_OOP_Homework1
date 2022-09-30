public class Bouquet {

    private Flower[] flowers;
    public class Bouquets{
        private final Flower[] flowers;
        public Bouquets(Flower[] flowers){
            this.flowers = flowers;
        }

        public int getExpiryDays(){
            int i = 0;
            for ( i = 0; i < flowers.length; i++) {
                if (i < flowers[i].getLifeSpat()) {
                    i = flowers[i].getLifeSpat();
                }
            }
            return  i;
            //ищем цветок с самым маленьким сроком годности
        }
        public double getCost(){
            int j = 0;
            for (j = 0; j < flowers.length; j++) {
                j = (int) ((j + flowers[j].getCost()) * 0.1);
            }
            return j;
            //Ищем сумму
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

