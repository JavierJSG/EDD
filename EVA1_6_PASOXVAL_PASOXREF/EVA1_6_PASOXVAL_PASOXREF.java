public class EVA1_6_PASOXVAL_PASOXREF {

    public static void main(String[] args) {

       int valOrig = 5;
        System.out.println("ValOrig en el main = " + valOrig);
        valOrig = incrementaQueSiFunciona(valOrig);
        incrementa(valOrig); //Dato de entrada
        System.out.println("ValOrig despues de llamar a incrementa = " + valOrig);

        //Demostracion de paso por referencia
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la X = " + objPrueba.x);
        System.out.println("objPrueba en el main = " + objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de la x despues de incrementa = " + objPrueba);
    }

    //Paso por valor --> Pasamos una copia del valor en una variable (variables locales primitivos)
    public static void incrementa(int val){ //recibe una COPIA de la variable original
        //Incrementar val en 1
        val+=1; //val = val+1; val +=1;
        System.out.println("Valor en incrementa = " + val);
    }

    public static int incrementaQueSiFunciona(int val){
        val++;
        return val++;
    }

    //Paso por referencia --> Pasan la direccion de memoria del objeto (objetos)
    public static void incrementaObj(Prueba val){
        System.out.println("Objeto en incrementaObj = " + val);
        val.x++;

    }

    static class Prueba{
        public int x = 10;
    }

}
