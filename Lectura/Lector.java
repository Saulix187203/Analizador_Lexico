import java.util.Scanner;
import Tokens.IntPose;
import Tokens.Letters;

public class Lector {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los caracteres: ");

        while (entrada.hasNext()) {
            String token = entrada.next();
            //Letters letra = new Letters(token);
            IntPose numero = new IntPose(token);

            if (token.matches("[a-zA-Z]+")) {
                System.out.printf("LETTER(%s)%n", token);
            } if (numero.getValue() != null) {
                System.out.printf("NUMBER(%s)%n", numero.getValue());
            } else {
                System.out.printf("ERROR(%s)%n", token);
            }
        }
        entrada.close();
    }
}