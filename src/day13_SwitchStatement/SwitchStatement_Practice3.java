package day13_SwitchStatement;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {
        String browser = "cybertek";
        String selectedBrowser ="";

        switch(browser){
            case "chrome":
                selectedBrowser="CHROME BROWSER";
                break;

            case"firefox":
                selectedBrowser="FIREFOX BROWSER";
                break;

            case "safari":
                selectedBrowser = "SAFARI BROWSER";
                break;

            case "opera":
                selectedBrowser ="OPERA BROWSER";
                break;

            case "edge":
                selectedBrowser = "EDGE BROWSER";
                break;

            case "ie":
                selectedBrowser ="IE BROWSER";
                break;

            default: selectedBrowser = "INVALID BROWSER";

        }
        System.out.println(selectedBrowser);
    }
}
