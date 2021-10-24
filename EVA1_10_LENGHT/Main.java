public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] aiDatos = new int[10];
        System.out.println("Tamaño del arreglo: " + aiDatos.length);
        System.out.println(aiDatos);
        System.out.println(args);
        double[] algo = new double[100];
        System.out.println(algo);

        for(int i = 0; i < aiDatos.length; i++){
            aiDatos[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i < 10; i++){
            System.out.println("" + aiDatos[i] +"");
        }
    }
}
