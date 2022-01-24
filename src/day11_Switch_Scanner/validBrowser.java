package day11_Switch_Scanner;

public class validBrowser {

    public static void main(String[] args) {

        String browserName = "opera";
        String result = " ";

        boolean validBrowser = browserName == "chrome" ||browserName == "firefox" || browserName == "opera"
                                || browserName == "safari" || browserName == "edge";

        if(validBrowser){

            if (browserName == "chrome"){
                result = "chrome selected";
            }else if (browserName == "firefox"){
                result = "firefox selected";
            }else if(browserName == "opera"){
                result = "opera selected";
            }else if(browserName == "safari"){
                result = "safari selected";
            }else {
                result = "edge selected";
            }

        }else {
            result = "invalid input";
        }
        System.out.println(result);
    }
    }

