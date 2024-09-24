import java.util.Scanner;

public class StepTracker {

    int goalByStepsPerDay = 10000;
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца: ");
        System.out.println(" 1 - Январь, 2 - Февраль, 3 - Март, 4 - Апрель, 5 - Май, 6 - Июнь,"
                + " 7 - Июль, 8 - Август, 9 - Сентябрь, 10 - Октябрь, 11 - Ноябрь, 12 - Декабрь");
        int monthNumber = scanner.nextInt();

        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Номер введенного месяца - некорректен!");
            return;
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scanner.nextInt();
        if (dayNumber > 30 || dayNumber < 1) {
            System.out.println("Номер введенного дня некорректен!");
            return;
        }

        System.out.println("Введите количество шагов");
        int stepCount = scanner.nextInt();
        if (stepCount < 1) {
            System.out.println("Количество шагов не может быть отрицательным числом или 0");
            return;
        }

        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[dayNumber - 1] = stepCount;
    }

    void changeStepGoal() {
        System.out.println();
        System.out.println("Введите новую цель по количеству шагов за день!");
        int newGoalSteps = scanner.nextInt();
        if (newGoalSteps < 1) {
            System.out.println("Изменить цель нельзя. Некорректный ввод данных");
        } else {
            goalByStepsPerDay = newGoalSteps;
        }
    }

    void printStatistic() {
        System.out.println("Введите номер месяца(от 1 до 12)");
        int month = scanner.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("Некорректный номер месяца!");
        }

        MonthData monthData = monthToData[month - 1];
        monthData.printDaysAndStepsFromMonth();
        System.out.println("-".repeat(50));
        System.out.println("Общее количество шагов за месяц: " + monthData.sumStepsFromMonth());
        System.out.println("Максимальное количество шагов за день : " + monthData.maxSteps());
        System.out.println("Среднее количество шагов: " + monthData.averageStepsPerMonth());
        System.out.println("Пройденная дистанция в км: " + converter.convertToKm(monthData.sumStepsFromMonth()));
        System.out.println("Количество сожжённых килокалорий: "
                + converter.convertStepsToKilocalories(monthData.sumStepsFromMonth()));
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println("-".repeat(50));
    }
}
