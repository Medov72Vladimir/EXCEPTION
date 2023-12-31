package Seminar_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DataReceptor {

    public static void getClientData(Client client) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        // Парсим введённую строку разделением фраз по пробелам
        String[] data = input.split(" ");

        // Проверка на число фраз в строке
        if (data.length != 6) {
            throw new RuntimeException("ОШИБКА! Должно быть шесть данных, разделённых пробелом. Вы ввели " + (data.length < 6 ? "меньше" : "больше") + " данных.");
        }

        // Проверяем конкретные данные
        else {

            // Проверяем Фамилию на пустоту
            String lastName = data[0].trim();
            if (lastName.isEmpty())
                throw new RuntimeException("ОШИБКА! Вы не ввели Фамилию.");
            // Проверяем Имя на пустоту
            String firstName = data[1].trim();
            if (firstName.isEmpty())
                throw new RuntimeException("ОШИБКА! Вы не ввели Имя.");
            // Проверяем Отчество на пустоту
            String middleName = data[2].trim();
            if (middleName.isEmpty())
                throw new RuntimeException("ОШИБКА! Вы не ввели Отчество.");

            // Обрабатываем и проверяем дату рождения
            LocalDate dateBirth;
            try {
                dateBirth = LocalDate.parse(data[3].trim(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            } catch (DateTimeParseException e) {
                throw new RuntimeException("ОШИБКА! Дата рождения должна быть введена в формате ДД.ММ.ГГГГ.");
            }

            // Проверяем номер телефонаИ
            String phoneNumber = data[4].trim();
            if (!phoneNumber.matches("\\d+")) {
                throw new RuntimeException("ОШИБКА! В номере телефона должны быть только цифры.");
            }
            if (phoneNumber.length() != 11) {
                throw new RuntimeException("ОШИБКА! В номере телефона должно быть 11 цифр (вы указали "+phoneNumber.length()+").");
            }

            // Проверяем пол
            char gender;
            String s = data[5].trim();
            if (!s.equals("m") && !s.equals("f")) {
                throw new RuntimeException("ОШИБКА! Пол нужно обозначить буквой m или f.");
            }
            gender = s.charAt(0);

            // Записываем данные в пустой экземпляр класса пользователя
            client.setData(lastName, firstName, middleName, dateBirth, phoneNumber, gender);
        }
    }
}