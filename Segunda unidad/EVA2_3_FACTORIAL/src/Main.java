public class Main {

    public static void main(String[] args) {
        System.out.println("Factorial de 5 = " + factorial(5));

    }

    public static int factorial(int iVal){ //Factorial usando factorial
        if (iVal == 0) //detenemos recursividad
            return 1;
        else
            return iVal * factorial(iVal -1); //Ejecutamos usando recursividad
    }

    public static int factorialFor(int iVal){ // factorial usando un ciclo
        int iTemp = 0;
        for (int i = iVal; i > 0; i--){
            iTemp = iTemp+1;
        }
        return iTemp;
    }
}
