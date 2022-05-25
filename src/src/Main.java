public class Main {
    public static void main(String[] args) {
        // создаем массив сотрудников
        Sotrudnik [] massive = new Sotrudnik[5];
        //определ€ем характеристики первого сотрудника
        String fio = "Petya";
        String dolshnost = "programmer";
        String email = "Petya@mail.ru";
        String phone = "88009002424";
        int age = 30;
        int zar = 10000;
        //создаем экземпл€р/сущность первого сотрудника
        Sotrudnik s1 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        //s1.ShowSotrudnik();
        // присваиваем элементу массива значение экземпл€ра/сущность сотрудника
        massive[0] = s1;

        //определ€ем характеристики второго сотрудника
        fio = "‘едор";
        dolshnost = "лаборант";
        email = "fedor@mail.ru";
        phone = "88007000101";
        age = 20;
        zar = 5000;
        //создаем экземпл€р/сущность второго сотрудника
        Sotrudnik s2 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        // присваиваем элементу массива значение экземпл€ра/сущность сотрудника
        massive[1] = s2;

        //определ€ем характеристики третьего сотрудника
        fio = "√риша";
        dolshnost = "системный администратор";
        email = "Grisha@mail.ru";
        phone = "88007000666";
        age = 55;
        zar = 35000;
        //создаем экземпл€р/сущность третьего сотрудника
        Sotrudnik s3 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        // присваиваем элементу массива значение экземпл€ра/сущность сотрудника
        massive[2] = s3;

        //определ€ем характеристики четвертого сотрудника
        fio = " ат€";
        dolshnost = "специалист по персоналу";
        email = "Kate@mail.ru";
        phone = "88009000999";
        age = 25;
        zar = 60000;
        //создаем экземпл€р/сущность четвертого сотрудника
        Sotrudnik s4 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        // присваиваем элементу массива значение экземпл€ра/сущность сотрудника
        massive[3] = s4;

        //определ€ем характеристики п€того сотрудника
        fio = "¬ас€";
        dolshnost = "директор";
        email = "Vase@mail.ru";
        phone = "88009999999";
        age = 41;
        zar = 100000;
        //создаем экземпл€р/сущность п€того сотрудника
        Sotrudnik s5 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        // присваиваем элементу массива значение экземпл€ра/сущность сотрудника
        massive[4] = s5;

        //выводим информацию о сотрудниках старше 40 лет
        for(int i = 0; i < 5; i++) {
            if (massive[i].age > 40) {
                massive[i].ShowSotrudnik();
            }
        }
    }
}

