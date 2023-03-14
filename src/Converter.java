public class Converter {

    int convStepsToKm(int steps){ // км за шаги
        int stepsKm = steps * 75 / 100000;
        return stepsKm;
    }
    int convStepsToCal(int steps){ // Ккал за шаги
        int stepsCal = steps * 50 / 1000;
        return stepsCal;
    }

}
