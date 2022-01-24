package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

    int score = -56;

    boolean a = score >= 90 && score <= 100;
    boolean b = score >= 80 && score <= 89;
    boolean c = score >= 70 && score <= 79;
    boolean d = score >= 60 && score <= 69;
    boolean f = score >= 0  && score <= 59;

    if (a){
        System.out.println("You got A!");
    }
    if (b){
        System.out.println("Try harder you got B!");
    }
    if (c){
        System.out.println("You should do better, you got C!");
    }
    if(d){
        System.out.println("camaaaaaan, you barely passed with D!");
    }
    if(f){
        System.out.println("you failed, youy suckaaaa");
    }
    if (!a && !b && !c && !d && !f ){

        System.out.println("agilli ol duz regem yaz");

    }
    }
}
