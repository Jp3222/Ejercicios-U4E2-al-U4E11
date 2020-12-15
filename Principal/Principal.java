package u4e2_u4e11;

public class Principal {

    public static void main(String[] args) {
        ArbolBB A = new ArbolBB();
        //Raiz
        A.add(A.getRaiz(), "Ana", 1997);
        //Nodos Izquierdos
        A.add(A.getRaiz(), "Roberto", 1982);
        A.add(A.getRaiz(), "Cristal", 1993);
        A.add(A.getRaiz(), "Gustavo", 1986);
        A.add(A.getRaiz(), "Martha", 1990);
        A.add(A.getRaiz(), "Fernando", 1981);
        A.add(A.getRaiz(), "Carmen", 1970);
        //Nodos Derechos
        A.add(A.getRaiz(), "Joseline", 2003);
        A.add(A.getRaiz(), "Alicia", 2009);
        A.add(A.getRaiz(), "Cesar", 2005);
        A.add(A.getRaiz(), "Ramiro", 2001);
        A.add(A.getRaiz(), "Lalo", 2002);

        System.out.println("1.- Persona con la edad mas pequeña:\n"
                + A.EdadMin() + "\n");
        System.out.println("2.- Persona con la edad mas grade:\n"
                + A.EdadMax() + "\n");
        System.out.println("3.- Diferencia de edad entra la personas mas grende "
                + "\ny la mas pequeña: " + A.Diferencia() + "\n");
        System.out.println("4.- Numero de personas " + A.getNoNodos() + "\n");
        System.out.println("5.- Suma de alturas: " + A.Suma() + "\n");
        System.out.println("6.- Promedio de edades: " + A.Promedio() + "\n");
        System.out.println("7.- Altura del arbol: " + A.Altura(A.getRaiz()) + "\n");
        System.out.println("8.- preOrden");
        A.preOrden(A.getRaiz());
        System.out.println("\n9.- inOrden");
        A.inOrden(A.getRaiz());
        System.out.println("\n10.- postOrden");
        A.postOrden(A.getRaiz());
        System.out.println("");
    }
}
