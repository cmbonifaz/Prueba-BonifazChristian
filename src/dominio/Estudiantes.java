package dominio;

public class Estudiantes {

    private String nombre;
    private char genero;
    private double nota;

    public Estudiantes(String nombre, char genero, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return this.nombre + "   " + this.genero + "   " + this.nota;
    }
}
