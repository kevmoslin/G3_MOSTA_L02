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

    public String toString(){
        return "Golosina Nombre: " + nombre + "Golosina Peso: " + peso;
    }
}
