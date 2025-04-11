package aulas.aula3_ExcecoesVerificadas.regex;

public class Main {
    public static void main(String[] args) {
        
        String str;
        String regex;
        
        str = "a"; //true
        regex = "a";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        /*
        boolean matches
        */
        str = "aa"; //false
        regex = "a";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "a"; //true
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
                
        str = "b"; //true
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
                
        str = "B"; //false
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
                
        str = "B"; //true
        regex = "[a-zA-Z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
                
        str = "BB"; //false
        regex = "[a-zA-Z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
                
        str = "Bb"; //true
        regex = "[a-zA-Z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
                
    }
}
