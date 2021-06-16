
package test;

import dominio.Estudiantes;
import java.util.Scanner;


public class PruebaEstudiantes {
    static Scanner datos = new Scanner(System.in);
    public static void main(String[] args) {
        int nroEstudiantes;
        Estudiantes [] est;
        System.out.println("Ingrese el Nro de estudiantes de curso: ");
        nroEstudiantes=datos.nextInt();
        est = new Estudiantes [nroEstudiantes];
        llenaDatos(est);
        System.out.println("los datos almacenados de los estudiantes son: ");
        for (int i = 0; i <est.length; i++) {
            System.out.println(est[i]);
        }
        System.out.println("El porcentaje de hombres del curso es: ");
        System.out.println("El porcentaje de mujeres del curso es: ");
        System.out.println("El porcentaje de hombres encma del promedio es: ");
        System.out.println("El porcentaje de mujeres encma del promedio es: ");
        System.out.println("El estudiante con mas alta calificacion es:  ");
    }
 public static void llenaDatos(Estudiantes estu[]) {
        String nombre=null;
        String genero=null;
        double nota;
        for (int i = 0; i < estu.length; i++) {
            datos.nextLine();
            System.out.println("Nombre: ");
            nombre = datos.nextLine();
            System.out.println("Genero: ");
            genero = datos.nextLine();
            System.out.println("Nota: ");
            nota = datos.nextDouble();
            estu[i] = new Estudiantes(nombre, genero, nota);
            
        }

    }
}
