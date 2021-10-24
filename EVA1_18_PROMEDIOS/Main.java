import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    int[][] aiGrupos;
	    //Preguntamos al usuario por los grupos
        System.out.println("Cuantos grupos son?");
        int iNoGrupos = input.nextInt();
        //Los grupos representan las filas
        aiGrupos = new int [iNoGrupos][]; //Si vamos a especificar una sola dimension, dejar vacio la otra dimension
        for(int i = 0; i < aiGrupos.length; i++){
            System.out.println("Para el grupo " + i +"Cuantos estudiantes son?");
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int[iNoEstu];
        }
        //Preguntamos las edades
        for (int i = 0; i < aiGrupos.length; i++){ //Primera dimension filas grupos
            for (int j = 0; j < aiGrupos[i].length; j++){ //Segunda dimension, parada grupo, cuantos
                System.out.print("[" + "]");
            }
            System.out.println("");
        }
    }
}
