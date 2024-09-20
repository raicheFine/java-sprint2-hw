import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StepTrecker stepTrecker = new StepTrecker(new Scanner(System.in));

        System.out.println("Вас приветствует счётчик калорий!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            int actionNumber = scanner.nextInt();

            switch (actionNumber) {
                case 1:
                    stepTrecker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    stepTrecker.changeStepGoal();
                    break;
                case 3:
                    stepTrecker.printStatistic();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Неизвестная команда");
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
