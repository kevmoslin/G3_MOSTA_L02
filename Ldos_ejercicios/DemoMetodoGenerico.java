package Ldos_ejercicios;

public class DemoMetodoGenerico {
    static < T extends Comparable <T>> boolean igualArrays (T[] x, T[] y){
        //Si las longitudes de los arrays son diferentes,
        //entonces los arrays son diferentes.
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++){
            if (!x[i].equals(y[i])) {
                return false;
            }
        }
        return true;
    }

    static <T> boolean exist(T[] array, T elemento) {
        for (T item : array) {
            if (item.equals(elemento)) {
                return true;
            }
        }
        return false;
    }
}
