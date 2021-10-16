/*Diseñar un programa Java que lea por teclado 10 números enteros y los guarde en un array. A continuación calcular y
 mostrar por separado la media de los valores positivos y la de los valores negativos.*/
import java.util.Scanner;
public class vectorestarea {
    public static void main(String[] args) {
        Scanner nc= new Scanner(System.in);
        int arreglo[]= new int[10];
        float funcion1,funcion2;

        System.out.println("Ingrese los valores positivos y negativos del vector:");
        for(int i=0; i<arreglo.length; i++){
            arreglo[i]=nc.nextInt();
        }

        funcion1= positivos(arreglo);
        System.out.println("El promedio de los numeros positivos es:"+funcion1);
        funcion2=negativos(arreglo);
        System.out.println("El promedio de los numeros negativos es:"+funcion2);
    }
    public static float positivos(int arreglo[]) {
        int mediapot=0, contador=0; 
        float promedio;

        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]>=0){
                mediapot = mediapot+arreglo[i];
                contador +=1;
            }
        }
        promedio= mediapot/contador;
        return(promedio);
    }
    public static float negativos(int arreglo[]) {
        int medianeg=0, contador=0;
        float promedio;
         
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] <= 0){
                medianeg = medianeg+arreglo[i];
                contador +=1;
            }
        }
        promedio= medianeg/contador;
        return(promedio);
    }
  }

