package u4e2_u4e11;

public class Nodo {

    private int año, edad;
    private String nombre;
    private Nodo Hizq, Hder;

    public Nodo(String nom, int año) {
        this.año = año;
        this.edad = (2020 - año);
        this.nombre = nom;
        this.Hizq = null;
        this.Hder = null;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getHizq() {
        return Hizq;
    }

    public void setHizq(Nodo Hizq) {
        this.Hizq = Hizq;
    }

    public Nodo getHder() {
        return Hder;
    }

    public void setHder(Nodo Hder) {
        this.Hder = Hder;
    }

    @Override
    public String toString() {
        return "[Nombre: " + nombre + " Edad: " + edad + " Año: " + año + "]";
    }

}
