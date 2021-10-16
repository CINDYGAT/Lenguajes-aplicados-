import java.util.Scanner;
public class tareaciclos {
    public static void main(String[] args) {
        //definiendo variables
        Scanner foo = new Scanner(System.in);
        char eleccion;
        int arreglo[] = {5,8,24,96,14,36,22,74,49,10};
        int contador=0;

        //Mostrando al usuario el menu y se pide escoja una opcion 
        System.out.println("Ingrese la opcion deseada: \n a) Numeros menores de 15 \n b) Numeros mayores de 50 \n c) Numeros entre 25 y 45");
        eleccion=foo.next().charAt(0); 
        
        //opcion a ejecutar en base al input del usuario
        if(eleccion=='a'){ 
            for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[i]< 15){
                    contador= contador+1;
                }
            }
            System.out.println("La cantidad de elementos en el conjunto menores a 15 son: "+contador);
        } else if(eleccion == 'b'){ 
            for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[i]> 50){
                    contador= contador+1;
                }
            }
            System.out.println("La cantidad de elementos en el conjunto mayores a 50 son: "+contador);
        } else if(eleccion == 'c'){
            for (int i = 0; i < arreglo.length; i++) {
                if(25 < arreglo[i] && arreglo[i]< 45){
                    contador= contador+1;
                }
            }
            System.out.println("La cantidad de elementos en el conjunto entre el rango de 25 y 45 son: "+contador); 
        } else{
            System.out.println("La opcion ingresada no es valida");
        }
    }
}