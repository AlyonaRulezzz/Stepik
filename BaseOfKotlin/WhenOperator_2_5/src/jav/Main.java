package jav;

public class Main {

    public static String month = "June";

    public static void main(String[] args) {
        month = month.toLowerCase();
        String season;
        switch (month) {
            case "january":
            case "february":
            case "december":
                season = "winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "summer";
                break;
            default:
                season = "autumn";
        }
        System.out.println(season);
    }
}
