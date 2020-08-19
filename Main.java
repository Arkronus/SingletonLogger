import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger logger = Logger.getLogger();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер списка");
        int listSize = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу для значений");
        int upperLimit = Integer.parseInt(scanner.nextLine());

        logger.log("Создаем и наполняем список");
        List<Integer> list = buildRandomList(listSize, upperLimit);
        System.out.println("Вот случайный список: " + list);

        System.out.println("Просим пользователя ввести входные данные для фильтрации");
        int threshold = Integer.parseInt(scanner.nextLine());
        List<Integer> result = new Filter(threshold).filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);

        logger.log("Завершаем программу");
    }

    private static List<Integer> buildRandomList(int size, int limit){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(limit));
        }
        return list;
    }
}
