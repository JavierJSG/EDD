/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_arreglos;

/**
 *
 * @author Admin
 */
public class Eva1_12_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[3];//12 bytes --> 3 enteros x 4 bytes
        System.out.println("Direcion de iArreglo = " + iArreglo);
        iArreglo [0] = 0;
        iArreglo [1] = 1;
        iArreglo [2] = 2;
        //iArreglo [3] = 3; error: ArrayIndxOutOfBound --> Nos pasamos de los limites del arreglo
        for (int i = 0; i < iArreglo.length; i++){
            System.out.println("Cuenta " + i + " = $" + iArreglo[i]);
        }
        iArreglo = new int[2];
        System.out.println("Direcion de iArreglo modificado = " + iArreglo);
        for (int i = 0; i < iArreglo.length; i++){
            System.out.println("Cuenta Modificada " + i + " = $" + iArreglo[i]); 
    }
    
   }
}   
