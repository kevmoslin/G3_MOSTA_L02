package Ldos;
import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa < T > implements Iterable < T > {
    private ArrayList < T > lista;
    private int tope;

    public Bolsa(){
        this.lista = new ArrayList<>();
    }
    
    public Bolsa(int tope) {
        super();
        this.tope = 5;
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
