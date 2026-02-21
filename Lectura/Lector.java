import java.util.Scanner;

public class Lector {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los caracteres: ");

        while (entrada.hasNextLine()) {
            String line = entrada.nextLine();

            for (int i = 0; i < line.length(); i++) {
                char caracter = line.charAt(i);

                if (Character.isDigit(caracter)) {
                    int j = i;
                    while (j < line.length() && Character.isDigit(line.charAt(j))) {
                        j++;
                    }
                    String number = line.substring(i, j);
                    System.out.printf("NUMBER(%s)%n", number);
                    i = j - 1; // avanzar el índice al final del número
                } else if (Character.isLetter(caracter)) {
                    System.out.printf("LETTER(%c)%n", caracter);
                } else if ("+-*/=".indexOf(caracter) >= 0) {
                    System.out.printf("OPERATOR(%c)%n", caracter);
                } else if (Character.isWhitespace(caracter)) {
                    // no debería ocurrir porque usamos next()
                } else {
                    System.out.printf("ERROR(%c)%n", caracter);
                }
            }


            // Si quieres procesar sólo una línea y terminar, descomenta la siguiente línea:
            // break;
        }

        entrada.close();
    }
}