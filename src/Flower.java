public class Flower {
    String flowerColor;
    String country;
    double cost;
    int lifeSpat;


    public Flower(String flowerColor, String country, double cost, int lifeSpat) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpat = lifeSpat;
    }


    void properties() {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            flowerColor = "не указан";
            System.out.println("Вид цветка - " + flowerColor);
        } else {
            System.out.println("Вид цветка - " + flowerColor);
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";
            System.out.println("Страна происхождения - " + country);
        } else {
            System.out.println("Страна происхождения - " + country);
        }
        if (cost <= 0) {
            cost = 1;
            System.out.println("Стоимость - " + cost);
        } else {
            System.out.println("Стоимость - " + cost);
        }
        System.out.println();
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpat() {
        return lifeSpat;
    }
}
