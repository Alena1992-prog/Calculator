import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите выражение в формате: a + b, a - b, a * b или a / b");

            try {
                // Чтение входных данных
                String input = scanner.nextLine();
                String[] tokens = input.split(" ");
                if (tokens.length != 3) {
                    throw new IllegalArgumentException("Неправильный формат выражения");
                }

                // Парсинг чисел
                int a = Integer.parseInt(tokens[0]);
                int b = Integer.parseInt(tokens[2]);

                // Вычисление результата
                int result;
                switch (tokens[1]) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                    default:
                        throw new IllegalArgumentException("Неподдерживаемая арифметическая операция");
                }

                // Вывод результата
                System.out.println("Результат: " + result);
            } catch (NumberFormatException e) {
                System.err.println("Ошибка: неверный формат числа");
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }
    }