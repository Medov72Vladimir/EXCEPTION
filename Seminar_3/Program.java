package Seminar_3;

public class Program {
    public static void main(String[] args) {

        System.out.println("Введите данные, разделённые пробелом:");
        System.out.println("Фамилия Имя Отчество датарождения номертелефона пол");

        // Вводим бесконечный цикл, чтобы пользователь мог вводить свои данные вновь и вновь в случае неуспешной валидации введённых данных
        while (true) {
            try {
                Client client = new Client(); // Создаём экземпляр пользователя
                // Через консоль принимаем данные, проверяем и наполняем ими нашего пользователя
                DataReceptor.getClientData(client);
                DataFileSaver.saveClientData(client); // Сохраняем в файл

                System.out.println("ОК! Данные успешно сохранены.");
                break; // Выходим из бесконечного цикла
            } catch (RuntimeException e) {
                System.err.println(e.getMessage()); //при проблеме с валидацией данных выбрасывает исключение
                System.out.println("ОШИБКА! Укажите данные заново:");
                break; // Выходим из бесконечного цикла
            }
        }
    }
}
