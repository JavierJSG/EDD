public class Main {

    public static void main(String[] args) {
        //Arreglo de 4 dimensiones
        int [][][][] iTese = new int[5][3][2][6];
        //Cuantos enteros almacena? R=180 enteros = 720 bytes

        for (int i = 0; i < iTese.length; i++){ //Primera dimension
            for (int j = 0; j < iTese[i].length; j++){ //Segunda dimension
                for (int k= 0; k < iTese[i][j].length; k++){ //Tercera dimension
                    for (int l= 0; l<iTese[i][j][k].length; l++){ //Cuarta dimension
                        iTese[i][j][k][l] = 100;
                        System.out.println("[" + iTese+"] ");


                    }
                }
            }
        }

    }
}
