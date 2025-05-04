//PRACTICA 4:
/* Cálculo de la distancia de edición
 Implemente en Java la distancia de edición entre dos palabras según lo expuesto
 las diapositivas de Dan Jurafsky: https://web.stanford.edu/class/cs124/lec/med
 .pdf. No es necesario que almacene la traza para transformar una palabra en
 otra.
 El algoritmo estará implementado en la clase CalculadoraDeDistancias.java
 de acuerdo con la siguiente estructura:
 */
package matematicas;

public class Matematicas{
 /**
 * Calcula la distancia de edición, tal y como la expone
 * Jurafsky entre las cadenas `s1` y `s2`.
 */
 public static int calcularDistancia(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[][]dp = new int[n+1][m+1];
    
        // Inicializamos la primera fila y columna
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }
    
        // Rellenamos la tabla
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]; // No hay coste
                } else {
                    dp[i][j] = Math.min(Math.min(
                                        dp[i-1][j] + 1, //eliminar
                                        dp[i][j-1] + 1), //insertar
                                        dp[i-1][j-1] + 1); //sustituir
                }
            }
        }
        //devolvemos el valor máximo
        //resultado final: ultima celda de la tabla
        return dp[m][n];
   
 }
 }