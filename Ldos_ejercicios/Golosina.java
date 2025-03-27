package Ldos_ejercicios;

public class Golosina {
    private String nombre;
    private double peso;

    public Golosina(String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public boolean equals(Object objeto){
        if (this == objeto) {
            return true;
        }

        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }

        Golosina golosina = (Golosina) objeto;
        return Double.compare(golosina.peso, peso) == 0 && nombre.equals(golosina.nombre);
    }

    public String toString(){
        return nombre + " (" + peso + "g)";
    }
}
