package Ldos_ejercicios;

public class Principal {
    public static void main(String []args){
        Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina > ();
        Bolsa < Golosina > bolsaGo = new Bolsa < Golosina > ();

        Golosina g = new Golosina("tuyo", 5);
        Golosina g2 = new Golosina("ole ole", 4);
        
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");

        bolsaGo.add(g);
        bolsaGo.add(g2);
        
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        bolsaCho.mostrarContenido();
        bolsaGo.mostrarContenido();

    }
}
