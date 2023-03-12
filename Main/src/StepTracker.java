import java.util.Scanner;
class StepTracker {
    Converter converter = new Converter();
    Scanner scanner = new Scanner(System.in);
    MonthData[] monthToData = new MonthData[12];
    StepTracker() {     //Массивы: 12 месяцев +дт
        for (int i = 0; i < monthToData.length; i++)
            monthToData[i] = new MonthData();
    }
    void addNewNumberStepsPerDay() {    // Ввод количества шагов за определенный день и месяц

        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Ошибка!\nНеправильный ввод месяца!\n");
            return;
        }

        System.out.println("Введите день от 1 до 30: ");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Ошибка!\nНеправильный ввод дня!\n");
            return;
        }

        System.out.println("Введите количество шагов: ");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Ошибка!\nНеправильный ввод шагов!\n");
            return;
        }
        monthToData[month - 1].days[day - 1] = steps;
    }
    int stepsGoal = 10000;      //Начальная цель
    void changeStepGoal() {     // Изменение цели по количеству шагов в день
        System.out.println("Введите новую цель!");
        stepsGoal = scanner.nextInt();
        if (stepsGoal < 0) {
            System.out.println("Ошибка!\nНеправильный ввод цели!\nНовая цель = 10000\n");
            stepsGoal = 10000;
        }
    }
    void printStatistic() {     //Вывод статистики за определенный месяц
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Ошибка!\nНеправильный ввод месяца!\n");
            return;
        }
        int sumSteps = monthToData[month - 1].sumStepsMonth();
        System.out.println("Общая статистика по дням");
        monthToData[month - 1].printDayAndStepsMonth();
        System.out.println("\nЗа месяц пройдено: " + sumSteps+" шагов!");
        System.out.println("Максимальное пройденное количество шагов за день: " + monthToData[month - 1].maxSteps());
        System.out.println("Среднее пройденное количество шагов за месяц: " + (sumSteps / 30));
        System.out.println("Проейдено за месяц: " + converter.convStepsToKm(sumSteps) + " км.");
        System.out.println("Количество сожжённых килокалорий за месяц: " + converter.convStepsToCal(sumSteps));
        System.out.println("Лучшая серия: " + monthToData[month - 1].bestSeries(stepsGoal));
        System.out.println();

    }
}
