class MonthData {
    int days[] = new int[30];

    void printDayAndStepsMonth() {              //Статитика за каждый день в месяце
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день:" + days[i]);
        }
    }
    int sumStepsMonth() {           //Сумма шагов за месяц
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        return sum;
    }
    int maxSteps() {          //Максимальное значение за месяц
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (maxSteps < days[i]) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }
    int bestSeries(int stepsGoal) {     // лучшая серия: максимальное количество подряд идущих дней,
        int maxSteps = 0, series = 0, maxSeries = 0; //  в течение которых количество шагов за день
        for (int i = 0; i < days.length; i++) {                     // было равно или выше целевого.
            if (stepsGoal <= days[i]) {
                if (++series > maxSeries) {
                    maxSeries = series;
                }
            } else
                series = 0;
        }
        return maxSeries;
    }
}

