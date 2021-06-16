
package dominio;

public class Estudiantes {
    private String nombre;
    private String genero;
    private double nota;
    
    private double promedio;
    private int estudiantesEncimaPromedio;

    public Estudiantes(String nombre, String genero, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
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
