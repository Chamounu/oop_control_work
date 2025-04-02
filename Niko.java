public class Niko {
    private final String gender; // Стать Niko
    private final int age;       // Вік Niko
    private final int height;    // Зріст Niko

    // Конструктор класу
    public Niko(String gender, int age, int height) {
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    // Метод, який повертає привітальне повідомлення
    public String greet() {
        return "Стать Niko: " + gender + "!";
    }

    // Метод, який повертає інформацію про вік та зріст
    public String displayInfo() {
        return "Йому " + age + " років, його зріст: " + height + " см.";
    }
}