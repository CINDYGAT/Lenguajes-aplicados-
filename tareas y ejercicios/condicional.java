//condicional con strings! super interesante
import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        //declarando las variables locales
        Scanner in = new Scanner(System.in);
        String dia= "";
        
        //primer digito se almacena en digito1
        System.out.println("Ingrese cualquier dia de la semana. Recuerde solo utilizar minusculas:");
        dia= in.nextLine();
        
        //condicional, verificando cual es el mayor.
        if(dia.equals("lunes") ){
            System.out.println("Lunes!");
        }
        else if(dia.equals("viernes")){
            System.out.println("Viernes!");
        }
        else if(dia.equals("sabado")){
            System.out.println("Sabado!");
        }
        else if(dia.equals("domingo")){
            System.out.println("Domingo!");
        }
        else{
            System.out.println("Bah! dia incorrecto :( ");
        }
        
    }
}