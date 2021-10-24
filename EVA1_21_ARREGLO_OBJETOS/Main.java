import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    Persona[] aPersonas = new Persona[10];//Arreglos de tamaño 10 que almacena objetos de tipo persona
	    //Para usar un objeto hay que crearlo y para crearlo usamos new
        for (int i =0; i< aPersonas.length;i++){
            aPersonas[i] = new Persona(); //Crea un objeto de tipo persona en la posicion que marque i
            System.out.println("Introduce un nombre: ");
            String nombre = input.nextLine();
            aPersonas[i].setNombre(nombre);

        }
        for (int i =0; i< aPersonas.length;i++){
            System.out.println("Nombre: " + aPersonas[i].getNombre());
        }


    }
}



 class Persona{
    private String nombre;

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
 }

