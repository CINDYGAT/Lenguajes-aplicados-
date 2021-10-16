import java.util.Scanner;
public class parcial2 {
    public static void main(String[] args) {
        int Resultado = 0, num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");

        num = sc.nextInt();

        do{

               Resultado = Resultado + num;

               System.out.print("Introduzca un número: ");

               num = sc.nextInt();

        }while (num >= 0);

        System.out.println("El Resultado es: " + Resultado );
    }
}
