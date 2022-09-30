public class Human {
   private int dateOfBirth;
    private String name;
    private String cityOfResidence;
    private String post;

    Human(int dateOfBirth, String name, String cityOfResidence, String post) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.cityOfResidence = cityOfResidence;
        this.post = post;
    }

    void Human() {
        if (name == null) {
            System.out.println("информация не указана");
        } else {
            System.out.println("Привет, меня зовут " + name);
        }
        if (cityOfResidence == null || cityOfResidence.isEmpty() || cityOfResidence.isBlank()) {
            System.out.println("информация не указана");
        } else {
            System.out.println("Я из города " + getCityOfResidence());
        }
        if (dateOfBirth <= 0 ) {
            dateOfBirth = 0;
        } else {
            System.out.println("Я родился в " + getDateOfBirth() + " году");
        }
        if (post == null) {
            System.out.println("информация не указана");
        } else {
            System.out.println("Я работаю на должности " + post);
        }
        System.out.println("Будем знакомы!");
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }
}
