public class Converter {


    int convertToKm(int steps) {

        System.out.println("Количество шагов: " + steps + " в километрах: " + ((steps * 75) / 100_000) + " км");
        return (steps * 75) / 100_000;    // 1km = 100_000cm;
    }

    int convertStepsToKilocalories(int steps) {
        System.out.println("За " + steps + " шага(ов) сожжено " + ((steps * 50) / 1000) + " килокалорий");
        return (steps * 50) / 1000; // 1 step = 50 cal, 1 kCal = 1000 cal;
    }

}
