public class Main {
    public static void main(String[] args) {
        // ������� ������ �����������
        Sotrudnik [] massive = new Sotrudnik[5];
        //���������� �������������� ������� ����������
        String fio = "Petya";
        String dolshnost = "programmer";
        String email = "Petya@mail.ru";
        String phone = "88009002424";
        int age = 30;
        int zar = 10000;
        //������� ���������/�������� ������� ����������
        Sotrudnik s1 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        //s1.ShowSotrudnik();
        // ����������� �������� ������� �������� ����������/�������� ����������
        massive[0] = s1;

        //���������� �������������� ������� ����������
        fio = "�����";
        dolshnost = "��������";
        email = "fedor@mail.ru";
        phone = "88007000101";
        age = 20;
        zar = 5000;
        //������� ���������/�������� ������� ����������
        Sotrudnik s2 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        // ����������� �������� ������� �������� ����������/�������� ����������
        massive[1] = s2;

        //���������� �������������� �������� ����������
        fio = "�����";
        dolshnost = "��������� �������������";
        email = "Grisha@mail.ru";
        phone = "88007000666";
        age = 55;
        zar = 35000;
        //������� ���������/�������� �������� ����������
        Sotrudnik s3 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        // ����������� �������� ������� �������� ����������/�������� ����������
        massive[2] = s3;

        //���������� �������������� ���������� ����������
        fio = "����";
        dolshnost = "���������� �� ���������";
        email = "Kate@mail.ru";
        phone = "88009000999";
        age = 25;
        zar = 60000;
        //������� ���������/�������� ���������� ����������
        Sotrudnik s4 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        // ����������� �������� ������� �������� ����������/�������� ����������
        massive[3] = s4;

        //���������� �������������� ������ ����������
        fio = "����";
        dolshnost = "��������";
        email = "Vase@mail.ru";
        phone = "88009999999";
        age = 41;
        zar = 100000;
        //������� ���������/�������� ������ ����������
        Sotrudnik s5 = new Sotrudnik(fio, dolshnost, email, phone, zar, age);
        // ����������� �������� ������� �������� ����������/�������� ����������
        massive[4] = s5;

        //������� ���������� � ����������� ������ 40 ���
        for(int i = 0; i < 5; i++) {
            if (massive[i].age > 40) {
                massive[i].ShowSotrudnik();
            }
        }
    }
}

