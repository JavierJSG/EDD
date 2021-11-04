public class Main {

    public static void main(String[] args) {
        System.out.println("el MCD de 180 y 48 es: " + gcd(180, 48));
    }

    public static int gcd(int iDividendo, int iDivisor){

        if (iDivisor == 0) { //Detenernos
            return iDividendo;
        }else{
            int iResi = iDividendo % iDivisor;
            return iResi;
        }
        //Como calculamos el residuo? con el modulo ---> %
        int iResi = iDividendo % iDivisor;
        return iResi;
        //Como hacerlo recursivo
        gcd(iDivisor, iResi);
        return gcd(iDivisor, iResi);
    }
}
