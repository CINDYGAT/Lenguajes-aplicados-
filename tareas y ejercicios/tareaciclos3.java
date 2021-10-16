import java.util.Scanner;

public class tareaciclos3 {
   public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       float valor1, valor2;
       char operacion;
    
       System.out.println("Ingrese dos valores numericos");
       valor1= sn.nextFloat();
       valor2 = sn.nextFloat();

       System.out.println("Ingrese la operacion a realizar +,-,*,/");
       operacion = sn.next().charAt(0);

       switch (operacion) {
           case '+': System.out.println("El resultado de la operacion es " + (valor1 + valor2)); break;
           case '-': System.out.println("El resultado de la operacion es " + (valor1 - valor2)); break;
           case '*': System.out.println("El resultado de la operacion es " + (valor1 * valor2)); break;
           case '/': System.out.println("El resultado de la operacion es " + (valor1 / valor2)); break;
           default: System.out.println("La operacion ingresada es invalida."); break;
       }
   } 
}
 