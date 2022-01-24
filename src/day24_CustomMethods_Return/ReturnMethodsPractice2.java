package day24_CustomMethods_Return;

public class ReturnMethodsPractice2 {

    public static void main(String[] args) {
        String str1 = studentGrade(98);


        if(str1.equals("A")){
            System.out.println("Excellent");
        }else if(str1.equals("B")){
            System.out.println("grate");
        }else if(str1.equals("C")){
            System.out.println("good");
        }else if(str1.equals("D")){
            System.out.println("passed");
        }else{
            System.out.println("Failed");
        }
    }



    public static String studentGrade(int score){

        String result = "";

        if(score < 0 || score >100){
            System.out.println("Invalid");
        }else{
            result = (score>=90)? "A" :(score>=80)? "B"
                     :(score>=70)? "C" :(score>=60)? "D"
                     : "F";
        }
                return result;
    }

}
