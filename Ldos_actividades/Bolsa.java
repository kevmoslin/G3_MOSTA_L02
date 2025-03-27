package Ldos_actividades;
import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa < T > implements Iterable < T > {
    private ArrayList < T > lista;
    private int tope;

    public Bolsa() {
        this.lista = new ArrayList<>();
        this.tope = 10;  
    }
    
    public Bolsa(int tope) {
        this.tope = tope;  
        this.lista = new ArrayList<>();
    }

    public void add(T objeto){
        if (lista.size() < tope) {
            lista.add(objeto);
        } else {
            throw new RuntimeException("no caben mas");
        }
    }
    public Iterator < T > iterator(){
        return lista.iterator();
    }
}
