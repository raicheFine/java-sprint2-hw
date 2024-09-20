public class MonthData {

    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int dayCount = 0; dayCount < days.length; dayCount++) {
            System.out.println((dayCount + 1) + " день: " + days[dayCount]);
        }
    }

    int sumStepsFromMonth() { // Общее кол-во шагов за месяц
        int totalMonthSteps = 0;

        for (int day : days) {
            totalMonthSteps += day;
        }

        return totalMonthSteps;
    }

    int maxSteps() { // Рекорд по кол-ву шагов за месяц
        int max = 0;

        for (int day : days) {
            max = Math.max(max, day);
        }

        return max;
    }

    int bestSeries(int goalByStepPerDay) { // Продолжительность лучшей серии
        int currentSeries = 0;
        int finalSeries = 0;

        for (int day : days) {
            if (day >= goalByStepPerDay) {
                currentSeries++;
                finalSeries = Math.max(currentSeries, finalSeries);
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }

    int averageStepsPerMonth() { // Среднее кол-во шагов за месяц
        return sumStepsFromMonth() / days.length;
    }
}
