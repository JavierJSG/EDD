public class Main {

    public static void main(String[] args) {
        //Declaran un arreglo de dos dimensiones:
        int [][] iMatriz = new int [3][3];
        System.out.println("Direccion de la matriz: " + iMatriz);
        System.out.println("Tamaño de la primer dimension (filas): " + iMatriz.length);
        //Recorrer un arreglo de dos o mas dimensiones requiere un for por cada dimension
        for (int i = 0; i < iMatriz.length; i++){ //Filas
            System.out.println("iMatriz ["+ i +"] = "+iMatriz[i]);
        }
    }
}
