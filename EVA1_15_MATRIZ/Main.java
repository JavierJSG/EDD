public class Main {

    public static void main(String[] args) {
	    int iMatriz [][] = new int [5][3];
	    //Acceder a un elemento
        iMatriz[0][0] = 1000; //Primera posicion
        iMatriz [4][2] = 2000; //Ultima posicion
        System.out.println("Tamaño del arreglo: " + iMatriz.length);
        //Como usar un ciclo for para recorrer un arreglo de N dimensiones
        //Ciclo por Cada dimension
        //Ciclos anidados(ciclo dentro de otro ciclo)

        for (int i = 0; i< iMatriz.length; i++){
            for (int j=0; j < 3; j++){
                iMatriz[i][j] = 1000;
            }
        }

        for (int i = 0; i< iMatriz.length; i++){
            for (int j=0; j < 3; j++){
                System.out.print("[" + iMatriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}
