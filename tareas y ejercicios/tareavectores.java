/*Diseñar  un vector de 30 enteros y obtener el número de pares 
y el número de impares introducidos. (No es necesario ingresar los valores de teclado)*/

public class tareavectores {
    public static void main(String[] args) {
        //int arreglo[]= new int[30];
        int funcion1,funcion2;

        int arreglo[]={2,5,7,9,4,-2,6,-9,-14,-89,-74,23,58,12,24,57,96,-98,87,220,14,52,78,77,74,12,69,83,74,0};
        funcion1= pares(arreglo);
        System.out.println("El numero de vectores pares es:"+funcion1);
        funcion2=impares(arreglo);
        System.out.println("El numero de vectores impares es:"+funcion2);
    }
    public static int pares(int arreglo[]) {
        int paresc=0;

        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]%2 == 0){
                paresc=paresc+1;
            }
        }
        return(paresc);
    }
    public static int impares(int arreglo[]) {
        int imparesc=0;

        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]%2 != 0){
                imparesc=imparesc+1;
            }
        }
        return(imparesc);
    }
}
