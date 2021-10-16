import java.util.Scanner;

public class tareaciclos2 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int usuario;
        int contador=0;

        System.out.println("Ingrese un numero positivo");
        usuario= numero.nextInt();
        
        do {
            usuario = usuario/10;
            contador++;
        } while (usuario>0 &&usuario <1000);
        System.out.println("El numero ingresado tiene " +contador+" digitos");
    }
}