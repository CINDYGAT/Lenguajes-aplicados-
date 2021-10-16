import java.util.Scanner;

public class condicionalvalorabs {
    public static void main(String[] args) {
        //declarando las variables locales
        Scanner in = new Scanner(System.in);
        int valor;
        
        //primer digito se almacena en digito1
        System.out.println("Ingrese el numero para calcular su valor absoluto");
        valor= in.nextInt();
        
        //condicional, verificando cual es el mayor.
        if( valor > 0 ){
            System.out.println("El valor absoluto es: "+valor);
        }
        else if(valor < 0){
            valor = -valor;
            System.out.println("El valor absoluto es:" +valor);
        }
        else{
            System.out.println("El valor ingresado es cero");
        }
        
    }
}