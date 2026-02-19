import java.util.Scanner;
import Tokens.IntPose;
import Tokens.Letters;

public class Lector {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los caracteres: ");

        while (entrada.hasNext() ) {
            String token = entrada.next();
            /* while (entrada.hasNext()) {
    String token = entrada.next();

    // Separa cada parte de números y letras dentro del token
    // La regex ([0-9]+|[a-zA-Z]+) captura grupos de números o letras consecutivos
    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("([0-9]+|[a-zA-Z]+)").matcher(token);

    while (matcher.find()) {
        String part = matcher.group();

        if (part.matches("[a-zA-Z]+")) {
            System.out.printf("LETTER(%s)%n", part);
        } else if (part.matches("[0-9]+")) {
            System.out.printf("NUMBER(%s)%n", part);
        } else {
            System.out.printf("ERROR(%s)%n", part);
        }
    }
}
 */
            

            if (token.matches("[a-zA-Z]+")) {
                System.out.printf("LETTER(%s)%n", token);
            } 
            else if (token.matches("[0-9]+")) {
                System.out.printf("NUMBER(%s)%n", token);
                //IntPose numero = new IntPose(token);
            } else if (token.matches("[+\\-*/=]")) {
                System.out.printf("ERROR(%s)%n", token);
            }
        }
        entrada.close();
    }
}