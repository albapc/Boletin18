package boletin18;

import javax.swing.JOptionPane;
import programacion.Persoal;

public class Academica {

    private static int numReferencia = 2018;
    private String nome;
    private int nota;
    Persoal alum = new Persoal();

    public Academica() {
    }

    public Academica(String nome, byte nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academica{" + "numReferencia=" + numReferencia++ + ", nome=" + nome
                + ", nota=" + nota + ", alum=" + alum + '}';
    }

    public void introducirDatos() {
        nome = JOptionPane.showInputDialog("Introduce o nome do alumno");
        alum.setTelefono(JOptionPane.showInputDialog("Introduce o numero de telefono"));
        alum.setCorreo(JOptionPane.showInputDialog("Introduce o correo do alumno"));
    }

    public void calcularNota() {
        nota = (Integer.parseInt(JOptionPane.showInputDialog("Introduce a nota")));
        while (nota < 1 || nota > 10) {
            JOptionPane.showMessageDialog(null, "Numero non valido");
            nota = (Integer.parseInt(JOptionPane.showInputDialog("Introduce a nota")));
        }
    }
}
