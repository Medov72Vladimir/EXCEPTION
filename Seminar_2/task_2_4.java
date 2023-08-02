/*
  Разработайте программу, которая выбросит Exception, когда пользователь 
  вводит пустую строку. Пользователю должно показаться сообщение, что пустые 
  строки вводить нельзя.
*/
import java.util.Scanner;

public class task_2_4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            String input = sc.nextLine();
            try {
               if (input.isEmpty()) {
                    throw new IllegalArgumentException("Ошибка! Пустые строки вводить нельзя."); 
               } 
               System.out.println("Вы ввели: " + input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
