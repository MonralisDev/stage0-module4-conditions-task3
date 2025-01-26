package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
            return;
        }
        int days;
        switch (month) {
            case 4: case 6: case 9: case 11: days = 30; break;
            case 2: days = 28; break;
            default: days = 31; break;
        }
        System.out.println(days);
    }
}
