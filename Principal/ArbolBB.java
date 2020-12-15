package u4e2_u4e11;

public class ArbolBB {

    private int NoNodos, Suma;
    private Nodo raiz;

    public ArbolBB() {
        this.raiz = null;
        this.NoNodos = 0;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public int getNoNodos() {
        return NoNodos;
    }

    public void add(Nodo r, String nom, int año) {
        if (isEmpty()) {
            raiz = new Nodo(nom, año);
            NoNodos++;
        } else if (año <= r.getAño()) {
            if (r.getHizq() == null) {
                r.setHizq(new Nodo(nom, año));
                NoNodos++;
            } else {
                add(r.getHizq(), nom, año);
            }
        } else {
            if (r.getHder() == null) {
                r.setHder(new Nodo(nom, año));
                NoNodos++;
            } else {
                add(r.getHder(), nom, año);
            }
        }
    }

    public Nodo EdadMax() {
        Nodo max = BuscarMin(raiz);
        return max;
    }

    private Nodo BuscarMin(Nodo r) {
        if (r.getHizq() != null) {
            r = BuscarMin(r.getHizq());
        } else if (r == null) {
            return null;
        }
        return r;
    }

    public Nodo EdadMin() {
        Nodo min = BuscarMax(raiz);
        return min;
    }

    private Nodo BuscarMax(Nodo r) {
        if (r.getHder() != null) {
            r = BuscarMax(r.getHder());
        } else if (r == null) {
            return null;
        }
        return r;
    }

    public int Diferencia() {
        Nodo Min = BuscarMin(raiz);
        Nodo Max = BuscarMax(raiz);
        int dif = (Min.getEdad() - Max.getEdad());
        return dif;
    }

    public int Suma() {
        return Suma = Sumando(raiz);
    }

    private int Sumando(Nodo r) {
        if (r != null) {
            return r.getEdad() + (Sumando(r.getHizq()) + Sumando(r.getHder()));
        } else {
            return 0;
        }
    }

    public int Promedio() {
        return Suma / NoNodos;
    }

    public int Altura(Nodo r) {
        if (r != null) {
            return 1 + (Math.max(Altura(r.getHizq()), Altura(r.getHder())));
        } else {
            return 0;
        }
    }

    public void preOrden(Nodo r) {
        if (r != null) {
            System.out.println(r);
            preOrden(r.getHizq());
            preOrden(r.getHder());
        }
    }

    public void inOrden(Nodo r) {
        if (r != null) {
            inOrden(r.getHizq());
            System.out.println(r);
            inOrden(r.getHder());
        }
    }

    public void postOrden(Nodo r) {
        if (r != null) {
            postOrden(r.getHizq());
            postOrden(r.getHder());
            System.out.println(r);
        }
    }
}
