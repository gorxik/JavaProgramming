package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int s = 99;

       String result= ( s >= 0 && s <=100)?
               (s>=7)? "passed" : "failed" : "invalid";

        System.out.println(result);

/*
        if( s >= 0 && s <=100){

             if(s>=60){
                 System.out.println("Excellent");
            }else{
                 System.out.println("failed");
             }




        }else{
            System.out.println("invalid");
        }
*/


    }

}
