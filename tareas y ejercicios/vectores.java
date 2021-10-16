/*Crear un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números 
entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los 
valores. Realizar un método para rellenar el array, para mostrar el contenido y la suma del array.*/

import java.util.Scanner;
public class vectores {
    public static void main(String[] args) {
        ingresodatos();
    }
    public static void ingresodatos() { //creando funcion para ingresar datos del vector
        Scanner nc= new Scanner(System.in);
        int tamano=nc.nextInt();
        int numero[]= new int[tamano];
       // int nuevo[]=new int[numero.length];
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
        System.out.println("La suma de los valores ingresados es:"+suma);
     }
}
