package Ldos_ejercicios;

public class TestGen {
    public static void main(String[] args) {
        // Crear cajoneria para Golosinas
        cajoneria<Golosina> cajoneriaGolosinas = new cajoneria<>();

        Golosina g1 = new Golosina("Caramelo", 10);
        Golosina g2 = new Golosina("Chicle", 5);
        Golosina g3 = new Golosina("Gomita", 15);
        Golosina g4 = new Golosina("Mazapán", 20);
        Golosina g5 = new Golosina("Turrón", 25);

        cajoneriaGolosinas.addCaja(new caja<>("Rojo", g1));
        cajoneriaGolosinas.addCaja(new caja<>("Azul", g2));
        cajoneriaGolosinas.addCaja(new caja<>("Verde", g3));
        cajoneriaGolosinas.addCaja(new caja<>("Amarillo", g4));
        cajoneriaGolosinas.addCaja(new caja<>("Blanco", g5));

        System.out.println("Contenido de la Cajoneria de Golosinas:");
        System.out.println(cajoneriaGolosinas);

        System.out.println(cajoneriaGolosinas.Search(new Golosina("Gomita", 15)));
        System.out.println(cajoneriaGolosinas.Search(new Golosina("Chocolate", 30)));

        System.out.println("Eliminando: " + cajoneriaGolosinas.delete(new Golosina("Mazapán", 20)));

        System.out.println("Contenido actualizado:");
        System.out.println(cajoneriaGolosinas);

        cajoneria<Chocolatina> cajoneriaChocolatinas = new cajoneria<>();

        Chocolatina c1 = new Chocolatina("Nestlé");
        Chocolatina c2 = new Chocolatina("Ferrero");
        Chocolatina c3 = new Chocolatina("Milka");

        cajoneriaChocolatinas.addCaja(new caja<>("Negro", c1));
        cajoneriaChocolatinas.addCaja(new caja<>("Dorado", c2));
        cajoneriaChocolatinas.addCaja(new caja<>("Morado", c3));

        System.out.println("Contenido de la Cajoneria de Chocolatinas:");
        System.out.println(cajoneriaChocolatinas);
    }
}