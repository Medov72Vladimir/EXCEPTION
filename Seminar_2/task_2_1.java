import java.util.Scanner;

/*  
  Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
  и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
  приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/
 
public class task_2_1 {
    public static void main(String[] args) {
        float number = getFloatFromUser();
        System.out.println("Вы ввели число:" + number);
    }

    public static float getFloatFromUser() {
        try (Scanner sc = new Scanner(System.in)) {
            float input = 0.0f;
            boolean isValid = false;
            while(!isValid) {
                System.out.println("Введите дробное число:");
                String inputString = sc.nextLine();
                try {
                    input = Float.parseFloat(inputString);
                    isValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Не корректный ввод! Требуется ввести дробное число.");
                }
            }
            return input;
        }
    }
}