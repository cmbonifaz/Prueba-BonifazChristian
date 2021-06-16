package test;

import dominio.Estudiantes;
import java.util.Scanner;

public class PruebaEstudiantes {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        int nroEstudiantes;
        Estudiantes[] est;
        System.out.println("Ingrese el Nro de estudiantes de curso: ");
        nroEstudiantes = datos.nextInt();
        est = new Estudiantes[nroEstudiantes];
        llenaDatos(est);
        System.out.println("los datos almacenados de los estudiantes son: ");
        for (int i = 0; i < est.length; i++) {
            System.out.println(est[i]);
        }
    }

    public static void llenaDatos(Estudiantes estu[]) {
        String nombre = null;
        char genero;
        double notaF = 0;
        double notaM = 0;
        double nota = 0;
        double porcentajeM = 0;
        double porcentajeF = 0;
        int hombres = 0;
        int mujeres = 0;
        double promedio = 0;
        double encimaM = 0;
        double encimaF = 0;
        double[] notasM = new double[estu.length];
        double[] notasF = new double[estu.length];

        for (int i = 0; i < estu.length; i++) {
            datos.nextLine();
            System.out.println("Nombre: ");
            nombre = datos.nextLine();
            System.out.println("Genero<<m>><<f>>: ");
            genero = datos.nextLine().charAt(0);
            if ((genero == 'm') || (genero == 'M')) {
                hombres++;
                porcentajeM++;
                System.out.println("Nota: ");
                notaM = datos.nextDouble();
                notasM[i] = notaM;
                nota = notaM;
            } else {
                mujeres++;
                porcentajeF++;
                System.out.println("Nota: ");
                notaF = datos.nextDouble();
                notasF[i] = notaF;
                nota = notaF;
            }
            promedio += nota;
            estu[i] = new Estudiantes(nombre, genero, nota);
        }
        porcentajeM = (porcentajeM / estu.length) * 100;
        porcentajeF = (porcentajeF / estu.length) * 100;
        promedio = promedio / estu.length;

        for (int i = 0; i < estu.length; i++) {
            if (notasM[i] > promedio) {
                encimaM++;
            }
        }
        for (int i = 0; i < estu.length; i++) {
            if (notasF[i] > promedio) {
                encimaF++;
            }
        }
        System.out.printf("El promedio del curso es: %.2f\n", promedio);
        System.out.printf("El porcentaje de hombres del curso es: %.2f\n", porcentajeM);
        System.out.printf("El porcentaje de mujeres del curso es: %.2f\n", porcentajeF);
        System.out.printf("El porcentaje de hombres encma del promedio es: %.2f\n", (encimaM / hombres) * 100);
        System.out.printf("El porcentaje de mujeres encma del promedio es: %.2f\n", (encimaF / mujeres) * 100);
    }

}
