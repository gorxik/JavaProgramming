package day28_ArrayList;

public class PasswordTask2 {

    public static void main(String[] args) {

        String password = "cLdeo1990@";

        int countUpper = 0;
        int countLower = 0;
        int countDigits = 0;
        int countSpecial = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpper++;
            }else if(Character.isLowerCase(each)){
                countLower++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecial++;
            }


        }


        System.out.println("countSpecial = " + countSpecial);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countLower = " + countLower);
        System.out.println("countUpper = " + countUpper);

        boolean hasUpper = countUpper>0;
        boolean hasLower = countLower>0;




    }

}
