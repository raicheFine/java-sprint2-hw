import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        System.out.println("Вас приветствует счётчик калорий!");

        while (true) {
            printMenu();

            int actionNumber = scanner.nextInt();

            switch (actionNumber) {
                case 1 -> stepTracker.addNewNumberStepsPerDay();
                case 2 -> stepTracker.changeStepGoal();
                case 3 -> stepTracker.printStatistic();
                case 4 -> {
                    System.out.println("Выход из приложения");
                    return;
                }
                default -> System.out.println("Неизвестная команда");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Выберите одну из команд:");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Изменить цель по количеству шагов за день");
        System.out.println("3. Напечатать статистику за определённый месяц");
        System.out.println("4. Выйти из приложения");
    }
}
