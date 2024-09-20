public class Converter {

    int convertToKm(int steps) {

        return (steps * 75) / 100_000;    // 1km = 100_000cm;
    }

    int convertStepsToKilocalories(int steps) {

        return (steps * 50) / 1000; // 1 step = 50 cal, 1 kCal = 1000 cal;
    }
}
