import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        while (true) {
            printMenu();
            int command = scan.nextInt();
            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                stepTracker.changeStepGoal();
            } else if (command == 3) {
                stepTracker.printStatistic();
            } else if (command == 0) {
                System.out.println("Выход");
                return;
            } else {
                System.out.println("Нет такой команды\n");
            }
        }
    }
    static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("Ввести количество шагов за определённый день - 1");
        System.out.println("Изменить цель по количеству шагов в день - 2");
        System.out.println("Напечатать статистику за определённый месяц - 3");
        System.out.println("Выйти - 0");
    }
}