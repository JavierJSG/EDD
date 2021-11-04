public class Main {

    public static void main(String[] args) {
	    Nodo inicio = new Nodo();
	    inicio.datos = 100;
	    inicio.referencia = new Nodo();
	    inicio.referencia.datos = 200;
	    inicio.referencia.referencia = null;
        System.out.println(inicio);
        System.out.println(inicio.referencia);


    }

    static class Nodo{
        int datos; //Guardamos la informacion
        Nodo referencia; //Nos permite enlazar nodos y crear cadenas (listas// )
    }
}

