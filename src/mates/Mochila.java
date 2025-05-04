public class Mochila {
	
        public static int mochila (int[] pesos, int[] valores, int capacidad){
            int n = pesos.length;
            int [][]dp = new int [n+1][capacidad+1];
    
            // Rellenamos la tabla dp
            for (int i=1; i<=n; i++){
                for (int j=1; j<=capacidad; j++){
                    if (pesos[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = Math.max(
                                    dp[i-1][j], 
                                    valores[i-1] + dp[i-1][j-pesos[i-1]]);
                    }
                }
            }
            // Devolvemos el valor máximo
            return dp[n][capacidad];
        
    }
}
