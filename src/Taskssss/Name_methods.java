package Taskssss;

public class Name_methods {

    public static void main(String[] args) {
        String name = "chyTe SjdhuA";
        formatName(name);
    }

    public static void formatName (String name){


        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1, name.indexOf(" ")).toLowerCase() + " "
                        + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase() +
                         name.substring(name.indexOf(" " ) + 2).toLowerCase());






    }
}


/*
  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"

 */