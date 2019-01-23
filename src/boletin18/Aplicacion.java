package boletin18;

public class Aplicacion {

    public static void main(String[] args) {
        Academica ac = new Academica();
        Academica ac2 = new Academica();

        ac.introducirDatos();
        ac.calcularNota();
        System.out.println(ac.toString());

        ac2.introducirDatos();
        ac2.calcularNota();
        System.out.println(ac2.toString());
    }

}
