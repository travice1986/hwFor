public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        for (int i = 1; i < 11; i++)
            System.out.println(i);
        //Task 2
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--)
            System.out.println(i);
        //Task 3
        System.out.println("Task 3");
        for (int i = 2; i < 18; i += 2)
            System.out.println(i);
        //Task 4
        System.out.println("Task 4");
        for (int i = 10; i > -11; i--)
            System.out.println(i);
        //Task 5
        System.out.println("Task 5");
        for (int i = 1904; i < 2095; i += 4)
            System.out.println(i);
        //Task 6
        System.out.println("Task 6");
        for (int i = 7; i < 99; i += 7)
            System.out.println(i);
        //Task 7
        System.out.println("Task 7");
        for (int i = 1; i < 516; i *= 2)
            System.out.println(i);
        //Task 8
        System.out.println("Task 8");
        int saving = 0;
        int savingChange = 29000;
        for (int i = 1; i < 13; i++) {
            saving += savingChange;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + saving + " рублей");
        }
        //Task 9
        System.out.println("Task 9");
        double saving1 = 0;
        int savingChange1 = 29000;
        for (int i = 1; i < 13; i++) {
            saving1 += savingChange1;
            saving1 *= 1.12;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) saving1 + " рублей");
        }
        //Task 10
        System.out.println("Task 10");
        for (int i = 1; i < 11; i++)
            System.out.println("2*" + i + "=" + 2 * i);
    }
}