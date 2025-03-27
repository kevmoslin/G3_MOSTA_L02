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

    }
}