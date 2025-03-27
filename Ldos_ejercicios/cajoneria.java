package Ldos_ejercicios;
import java.util.ArrayList; 

public class cajoneria<T> { 
    private ArrayList<caja<T>> lista; 

    public cajoneria() { 
        this.lista = new ArrayList<>(); 
    }

    public void addCaja(caja<T> caja) { 
        lista.add(caja);
    }

    public String Search(T elemento){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getContenido().equals(elemento)) {
                return "Elemento encontrado en la caja de color " + lista.get(i).getColor() + " en la posición " + i;
            }
        }
        return "Elemento no encontrado.";
    }

    public T delete(T elemento){
        for(int = 0; i < lista.size(); i++){
            if (lista.get(i).getContenido().equals(elemento)) {
                return lista.remove(i).getContenido();
            }
        }
        return null;
    }

    


}
