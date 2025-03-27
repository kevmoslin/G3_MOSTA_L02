package Ldos_ejercicios;

public class TestGen {
    public static void main(String []args){
        Integer nums[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};
        Integer nums3[] = {1,2,3,4,5};
        Integer nums4[] = {1,2,3,4,5};

        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(DemoMetodoGenerico.exist(v, "Sanchez"));
        System.out.println(DemoMetodoGenerico.exist(w, 34));
        System.out.println(DemoMetodoGenerico.exist(w,"Salas"));

        if (DemoMetodoGenerico.igualArrays(nums, nums)) {
            System.out.println("nums es igual a nums");
        }
        if (DemoMetodoGenerico.igualArrays(nums, nums2)) {
            System.out.println("nums es igual a nums2");
        }
        if (DemoMetodoGenerico.igualArrays(nums, nums3)) {
            System.out.println("nums es igual a nums3");
        }
        if (DemoMetodoGenerico.igualArrays(nums, nums4)) {
            System.out.println("nums es igual a nums4");
        }

        /*crea un array de double                   //A
        Double dvals[] = {1.1,2.2,3.3,4.4,5.5};   //B
        if (igualArrays(nums, dvals)) {
            System.out.println("nums es igual a dvals");
        }   */            
    }
}
