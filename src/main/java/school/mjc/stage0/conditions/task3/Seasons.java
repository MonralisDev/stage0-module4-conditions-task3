package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String season = "";
        if (month >= 1 && month <= 2 || month == 12) {
            season = "Winter";
        } else if (month >= 3 && month <= 5) {
            season = "Spring";
        } else if (month >= 6 && month <= 8) {
            season = "Summer";
        } else if (month >= 9 && month <= 11) {
            season = "Autumn";
        } else {
            System.out.println("wrong number!");
            return;
        }
        System.out.println(season);
    }
}