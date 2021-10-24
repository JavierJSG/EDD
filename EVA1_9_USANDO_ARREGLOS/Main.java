public class Main {

    public static void main(String[] args) {
	    //1. Un arreglo de enteros
        int[] aiDatos = new int[10];
        //2. Llenar con valores
        // Arreglo: estructura de acceso aleatorio
        //Indice:
        //Primer elemento del arreglo: posicion 0
        //Ultimo elemento del arreglo: posicion N-1 (N es el tamaño del arreglo)
        //Acceso a los valores:
        for(int i = 0; i < 10; i++ ){
            aiDatos[i] = (int) (Math.random() * 100); // Random --> Valores ente 0.0 y 1.0 * 100
        }
        //3. Imprimir los valores
        for(int i = 0; i < 10; i++ ){
            System.out.print(" " +  aiDatos[i] + " ");
          }


    }
}
