import java.util.Scanner;

public class tareaciclos3v2 {
    public static void main(String[] args) {
        Scanner mes = new Scanner(System.in);
        int eleccion, contador;
        contador = 0;

        System.out.println("Ingrese un numero del 1 al 12. Para salir del programa seleccione 0.");
        eleccion= mes.nextInt();

        while (eleccion != 0 && contador ==0) {
            switch (eleccion) {
                case 1: System.out.println("Enero"); contador++;break;
                case 2: System.out.println("Febrero");contador++;break;
                case 3: System.out.println("Marzo"); contador++;break;
                case 4: System.out.println("Abril"); contador++;break;
                case 5: System.out.println("Mayo"); contador++;break;
                case 6: System.out.println("Junio"); contador++;break;
                case 7: System.out.println("Julio"); contador++;break;
                case 8: System.out.println("Agosto"); contador++;break;
                case 9: System.out.println("Septiembre"); contador++;break;
                case 10: System.out.println("Octubre"); contador++;break;
                case 11: System.out.println("Noviembre"); contador++;break;
                case 12: System.out.println("Diciembre"); contador++;break;
                default: System.out.println("El valor ingresado no corresponde a ningun numero del 1 al 12."); contador++; break;
            }
        }
        if(eleccion == 0)
            System.out.println("Saliendo del programa...");
    }
}
