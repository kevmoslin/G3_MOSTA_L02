package Ldos_ejercicios;

public class caja<T> {
    private String color;
    private T contenido;

    public caja(String color, T contenido) {
        this.color = color;
        this.contenido = contenido;
    }

    public String getColor() {
        return color;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public String toString() {
        return "Caja de color " + color + " contiene: " + contenido.toString();
    }
}
