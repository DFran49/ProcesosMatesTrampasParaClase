public class Matriz {
    private double[][] matriz;

    // Constructor
    public Matriz(double[][] matriz) {
        this.matriz = matriz;
    }

    // Método para imprimir la matriz
    public void imprimir() {
        for (double[] row : matriz) {
            for (double num : row) {
                System.out.printf("%.2f ", num);
            }
            System.out.println();
        }
    }
    public Matriz transpuesta(){
        double [][] transpuesta= new double[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length ; j++) {
                transpuesta[i][j]=matriz[j][i];
            }
        }
        return new Matriz(transpuesta);
    }


    // Método para calcular la adjunta de la matriz
   /* public Matriz adjunta() {
        int n = matriz.length;
        double[][] adjunta = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjunta[j][i] = Math.pow(-1, i + j) * determinante(minor(matriz, i, j));
            }
        }

        return new Matriz(adjunta);
    }*/
}
