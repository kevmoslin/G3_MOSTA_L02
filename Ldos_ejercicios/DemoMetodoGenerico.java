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

    public static void main(String []args){
        Integer nums[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};
        Integer nums3[] = {1,2,3,4,5};
        Integer nums4[] = {1,2,3,4,5};

        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(exist(v, "Sanchez"));
        System.out.println(exist(w, 34));
        System.out.println(exist(w,"Salas"));

        if (igualArrays(nums, nums)) {
            System.out.println("nums es igual a nums");
        }
        if (igualArrays(nums, nums2)) {
            System.out.println("nums es igual a nums2");
        }
        if (igualArrays(nums, nums3)) {
            System.out.println("nums es igual a nums3");
        }
        if (igualArrays(nums, nums4)) {
            System.out.println("nums es igual a nums4");
        }

        /*crea un array de double                   //A
        Double dvals[] = {1.1,2.2,3.3,4.4,5.5};   //B
        if (igualArrays(nums, dvals)) {
            System.out.println("nums es igual a dvals");
        }   */            
    }

}
