/*Ingresar por teclado n cantidad de números y ordenarlos en forma ascendente*/
import java.util.Scanner;
public class ordenacionTarea {
    public static void main(String[] args) {
        ingresodatos();
    }
    public static void ingresodatos() {
        int i, longitud=0, aux=0;
        Scanner nc = new Scanner(System.in);

        System.out.println("Ingrese la longitud del vector:");
        longitud=nc.nextInt();
        int numero[]= new int[longitud];

        for(i=0; i<longitud; i++){
            System.out.println("Ingrese el vector en la posicion "+i);
            numero[i]=nc.nextInt();
        }
        //inicializando el ordenamiento
        for(int j=0; j<longitud ; j++){
            for(int g=j+1; g <longitud; g++){
                if(numero[g]< numero[j]){ //para orden descendente mayor-menor. Cambiamos a >
                    aux=numero[g];
                    numero[g]=numero[j];
                    numero[j]=aux;
                }
            }
        }
        desplegardatos(numero, longitud);
    }

    public static void desplegardatos(int datos[], int longitud) {
        System.out.println("El vector ordenado es:");
        System.out.printf("[");
        for(int i=0; i<longitud; i++){
            System.out.printf("%d,",datos[i]);
        }
        System.out.println(" ]\n");
    }
}
