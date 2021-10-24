public class Main {

    public static void main(String[] args) {

        int iVal= Integer.MAX_VALUE;
        System.out.println("Valor mas grande: " + iVal);

        iVal += 1;//Overflow = Desbordamiento "Se desborda el valor y nos manda al otro extremo, signo negativo"

        System.out.println("Valor mas grande: " + iVal);
        iVal= Integer.MIN_VALUE;
        System.out.println("Valor mas pequeño: " + iVal);


    }
}
