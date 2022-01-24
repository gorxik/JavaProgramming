package day01_JavaIntro;
import utilities.StringUtility;
public class test {


    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("-------------------");

        String s1 = "Wooden Spoon";

        StringUtility.reverse(s1);

        System.out.println(s1);
        System.out.println("-------------------");

        String word = "civic";

        StringUtility.isPalindrome(word);

        System.out.println(word);

        System.out.println("---------------------");

        String [] names = {"Abbaa", "anna", "java" };

        int count = 0;

        for (String each: names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

    }

}
