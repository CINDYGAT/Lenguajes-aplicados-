import java.util.Scanner;
class iguals {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String semana="";
        System.out.println("Ingrese un dia de la semana:");

        try {
            semana = in.nextLine();
            if(semana == "lunes"){
                System.out.println("El dia escogido es lunes!");
            } else if(semana == "martes"){
                System.out.println( "El dia escogido es martes");
            } else{
                System.out.println("El dia escogido corresponde a cualquier otro dia de la semana");
            }
        } catch (InputMismatchException ime) {
            System.out.println("cadena incorrecta");
        }
    }
}