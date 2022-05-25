import java.io.PrintStream;

public class Sotrudnik {
    public int age;
    public int zar;
    public String fio = "";
    public String dolsnost;
    public String email;
    public String phone;

    // конструктор сотрудников
    public Sotrudnik(String fio, String dolsnost, String email, String phone, int zar, int age) {
        this.fio = fio;
        this.dolsnost = dolsnost;
        this.email = email;
        this.age = age;
        this.zar = zar;
        this.phone = phone;
        //System.out.printf("Сотрудник %s должность %s email %s телефон %s зарплата %s возраст %s (лет) %n", fio, dolsnost, email, phone, zar, age);
    }

    //метод отображения сотрудников
    public void ShowSotrudnik(){
        System.out.printf("Сотрудник %s должность %s email %s телефон %s зарплата %s возраст %s (лет) %n", this.fio,
                this.dolsnost, this.email, this.phone, this.zar, this.age);
    }
}
