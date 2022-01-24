package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 596;

        if(score >= 0 && score <= 100){   //if score is valid

            if (score >= 60){   // if student passed the exam
                System.out.println("passed");

            }else{
                System.out.println("failed");
            }
        }else{
            System.out.println("invalid");

        }
        System.out.println("--------------------");


        int age = 1;
        boolean hasId = true;

      /*  if (hasId) { //if the person has an ID

            if (age >= 21) { //if the person is over or 21.
                System.out.println("yes you can get drunk now!!");
            } else { // if he is under 21
                System.out.println("not eligible to buy alcohol");
            }
        }else{ //if pre condition does not met print bring ID
            System.out.println("come back with an valid ID");
        }
*/

        System.out.println("-------------------------");

        String result = (age == 1) ? "Monday" :(age==3)? "Tuesday ":(age ==4)?
             "wEDNESDAY"  : "tHURSDAY";


    }


}
