package day14_Switch_Recap;

public class DaysInMonth2 {

    public static void main(String[] args) {
        int year = 2020;
        String month = "Feb";

        String result = "";
        switch (month) {
            case "Feb":
                result = (year % 4 == 0) ? "29 days" : "28 days";
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                result = "30 days";
                break;
            case "Jan":
            case "March":
            case "May":
            case "Jul":
            case "Aug":
            case "Okt":
            case "Dec":
                result = "31 days";
                break;

            default:
                result = "Invalid";

        }
        System.out.println(result);
    }
}
