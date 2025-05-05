package aplicacion;

import java.util.Scanner;
import matematicas.Matematicas;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();

        int distancia = Matematicas.calcularDistancia(palabra1, palabra2);

        System.out.println("La distancia de edición entre \"" + palabra1 + "\" y \"" + palabra2 + "\" es: " + distancia);
    }
}
