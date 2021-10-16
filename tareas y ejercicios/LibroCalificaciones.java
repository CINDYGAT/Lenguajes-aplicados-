Package PruebalibroCalificaciones;

import java.util.Scanner;


public class LibroCalificaciones {
    private String nombreDelCurso;

    public LibroCalificaciones(String nombre){
        nombreDelCurso = nombre;
    }

    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso =nombre;
    }
    public String ObtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    public void MostrarMensaje(){
        System.out.println("Bienvenido al libro de calidicaciones para \n %s\n\n", ObtenerNombreDelCurso());
    }
    public void determinarPromedioClase(){
        Scanner entrada = new Scanner(System.in);

        int total, contadorCalif, calificacion, promedio;
        total=0;
        contadorCalif=1;

        while (contadorCalif <=10) {
            System.out.println("Escriba la nota: "+contadorCalif + ":");
            calificacion= entrada.nextInt();
            total=total +calificacion;
            contadorCalif += 1;
        }
        promedio= total/10;
        System.out.printf("El total de las 10 notas es %d \n", total);
        System.out.printf("El total de las 10 notas es %d \n", promedio);
    }
}
