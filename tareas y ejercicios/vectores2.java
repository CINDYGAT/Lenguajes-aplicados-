import java.util.Scanner;
public class vectores2 {
    public static void main(String[] args) {
        ingresodatos();
    }
    public static void ingresodatos() { //creando funcion para ingresar datos del vector
        Scanner nc= new Scanner(System.in);
        int tamano;
        System.out.println("Ingrese el tamano del vector:");
        tamano=nc.nextInt();
        int numero[]= new int[tamano];
        int i;

        for(i=0; i<numero.length; i++){
            System.out.println("Ingrese el valor de la posicion: "+i);
            numero[i]=nc.nextInt();
        }
        mostrarDatos(numero); //llamando funcion para mostrar datos
        sumarDatos(numero); //llamando funcion para sumar datos
    }
    public static void mostrarDatos(int numero[]) { //creando funcion para ingresar datos del vector
        for(int i=0; i<numero.length ; i++){
            System.out.println("Ingrese solamente valores entre 0 y 9, cuya posicion es: "+i + " es "+numero[i]);
        }
     }
    public static void sumarDatos(int numero[]) { //creando funcion para sumar datos del vector
        int suma=0;

        for(int i=0; i<numero.length ; i++){
            suma= suma+ numero[i];
        }
        System.out.println("La suma de los valores ingresados es: "+suma);
     }
}
