import java.util.Random;

public class octubre27 {
    public static void main(String[] args) {
        int contador=0;
        char aleatoriedad;
        char cinta[]= new char[36];
        char MatA[][];
        int cintaT[];

        System.out.printf("[");
        for (int i = 0; i < 36; i++) { 
            aleatoriedad= Aleatoriedad();    
//vamos a restringir que solo exista una F en el vector
            if(aleatoriedad=='F' && contador==0){ //si el elemento random es el primer F, escribirlo
                cinta[i]=aleatoriedad;
                contador=contador+1;
            }       
            else if(aleatoriedad == 'F' && contador>0){ //si el elemento random es no es el primer F, hacer lo sig

                do{ //verificar si en la primera iteracion F cambia a otro valor
                    aleatoriedad= Aleatoriedad();  //instruccion para volver a randomizar
                    if(aleatoriedad=='F'){ //si vuelve a ser cero, volver al metodo aleatoriedad
                        Aleatoriedad();
                    }
                    else if(aleatoriedad != 'F'){
                        cinta[i]=aleatoriedad;
                    }
                }while(aleatoriedad == 'F' && contador>0);
            }
            else{   //considerando cualquier otro caso cuando el elemento random no es F
                cinta[i]=aleatoriedad;
            }
            System.out.printf("%c, ",aleatoriedad);
            
        }
        System.out.printf("]\n");

         //Imprimiendo el vector con los 36 random char
        System.out.printf("["); //para agregar la llave inicial del vector
        for(int j=0; j< 36; j++){
            System.out.printf("%c, ",cinta[j]);
         }
         System.out.printf("]\n");
        // cinta();
        // MatrizA(cinta);
        // MatrizB(cinta);
        // MatrizC(cinta);
        // MatrizD(cinta);

        MatA=MatrizA(cinta);
        cintaT=cinta();
        RecorridoMatx(MatA, cintaT, cinta,0);
    }
    public static char Aleatoriedad() {
        Random random = new Random();
        String setOfCharacters = "01LRNFABCD";
        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);
        return(randomChar);
    }
    //creando la matriz A y mostrandola
    public static char[][] MatrizA(char cinta[]){
        char matA[][] = new char[3][3];

        for(int i=0; i<3; i++){
            matA[0][i]=cinta[i];
        }
        for(int i=0; i<3; i++){
            matA[1][i]=cinta[i+3];
        }
        for(int i=0; i<3; i++){
            matA[2][i]=cinta[i+6];
        }

        //mostrando la matriz
        System.out.printf("La matriz A es: \n");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%c, ",matA[i][j]);
            }
         System.out.printf("\n");
        }
        System.out.printf("\n");

        return(matA);
    }
    public static char[][] MatrizB(char cinta[]){
        char matA[][] = new char[3][3];

        for(int i=0; i<3; i++){
            matA[0][i]=cinta[i+9];
        }
        for(int i=0; i<3; i++){
            matA[1][i]=cinta[i+12];
        }
        for(int i=0; i<3; i++){
            matA[2][i]=cinta[i+15];
        }

        //mostrando la matriz
        System.out.printf("La matriz B es: \n");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%c, ",matA[i][j]);
            }
         System.out.printf("\n");
        }
        System.out.printf("\n");

        return(matA);
    }
    public static char[][] MatrizC(char cinta[]){
        char matA[][] = new char[3][3];

        for(int i=0; i<3; i++){
            matA[0][i]=cinta[i+18];
        }
        for(int i=0; i<3; i++){
            matA[1][i]=cinta[i+21];
        }
        for(int i=0; i<3; i++){
            matA[2][i]=cinta[i+24];
        }

        //mostrando la matriz
        System.out.printf("La matriz C es: \n");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%c, ",matA[i][j]);
            }
         System.out.printf("\n");
        }
        System.out.printf("\n");

        return(matA);
    }
    public static char[][] MatrizD(char cinta[]){
        char matA[][] = new char[3][3];

        for(int i=0; i<3; i++){
            matA[0][i]=cinta[i+27];
        }
        for(int i=0; i<3; i++){
            matA[1][i]=cinta[i+30];
        }
        for(int i=0; i<3; i++){
            matA[2][i]=cinta[i+33];
        }

        //mostrando la matriz
        System.out.printf("La matriz D es: \n");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%c, ",matA[i][j]);
            }
         System.out.printf("\n");
        }
        System.out.printf("\n");

        return(matA);
    }
    public static int[] cinta(){
    int counter1=0, counter2=0;
        int cinta[]= new int[8];
        int valorescinta;

		for(int i = 0; i <8; i++) {
            valorescinta=cintaRandom(); //asignamos un valor random 0 o 1

            if(valorescinta==0){ //si es cero entra
                if(counter1<=3){ //si aun no tenemos 4 0's, lo escribimos y aumentamos 1 el contador
                    cinta[i]=valorescinta;
                    counter1=counter1+1;
                }
                else if(counter1>3){ //si ya tenemos 4 0's, solo queda que existan 1
                    cinta[i]=1;      // se escribe 1, ya que es la unica opcion
                    counter2=counter2+1; //se aumenta el contador del 1
                }
            }
            else if(valorescinta==1){ // si es 1 entra
                if(counter2<=3){ // si aun no tenemos 4 0's, lo escribirmos y aumenta el contador
                    cinta[i]=valorescinta;
                    counter2=counter2+1;
                }
                else if(counter2>3){ //si 1 aparece 4 veces, entonces solo queda que las opciones sean 0
                    cinta[i]=0;       //se escribe el 0 como unica opcion
                    counter1=counter1+1;    //se aumenta en 1 el contador de 0
                }
                }
            }
        
        
        for(int i = 0; i <8; i++) {
			System.out.println(cinta[i]);
        }
        return(cinta);
}
    public static int cintaRandom(){
        int min = 0;
		int max = 2;

        int getRandomValue = (int) (Math.random()*(max-min)) + min;
        return(getRandomValue);
}
    public static char[][] RecorridoSimple(char MatrizG[][]){
        int i,j;
        char MatrizU[][]=new char[3][3];

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                MatrizU[i][j]=MatrizG[i][j];
            }
        }
        return(MatrizU);

    }
    public static int[] RecorridoMatx(char MatG[][], int cinta[], char[] valMatx, int posicionVector){
        char MatB[][]=MatrizB(valMatx);
        char MatC[][]=MatrizC(valMatx);
        char MatD[][]= MatrizD(valMatx);
        char[][] matrizActual=RecorridoSimple(MatG);
        int cintaNueva[]=cinta;
        int actual_cinta=posicionVector;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(matrizActual[i][j]== '1'){
                    if(cintaNueva[actual_cinta]==0){
                        cintaNueva[actual_cinta]=1;
                        System.out.println("nueva cinta "+cintaNueva[actual_cinta]);
                    }
                    else{
                        cinta[actual_cinta]=0;
                        System.out.println("nueva cinta "+cintaNueva[actual_cinta]);
                    }
                }
                else if(matrizActual[i][j]== 'R'){
                    if(actual_cinta<7){
                        actual_cinta=actual_cinta+1; //si aun no se ha llegado al final, aumenta en 1
                        System.out.println("nueva cinta "+cintaNueva[actual_cinta]);
                    }
                    else if(actual_cinta==7){
                        actual_cinta=0; //si estamos al final de la cinta, regresa al inicio
                        System.out.println("nueva cinta "+cintaNueva[actual_cinta]);
                    }
                }
                else if(matrizActual[i][j]== 'L'){
                    if(actual_cinta>0 && actual_cinta<cintaNueva.length){
                        actual_cinta=actual_cinta-1; //si se encuentra en la posion 1 o mayor
                        System.out.println("nueva cinta "+cintaNueva[actual_cinta]);
                    }
                    else if(actual_cinta==0){
                        actual_cinta=7; //si se encuentra en la posicion 0
                        System.out.println("nueva cinta "+cintaNueva[actual_cinta]);
                    }
                }
                else if(matrizActual[i][j]== 'F'){
                    System.out.println("Fin del juego\n");
                }
                else if(matrizActual[i][j]== 'B'){
                    RecorridoMatx(MatB, cintaNueva, valMatx, actual_cinta);
                }
                else if(matrizActual[i][j]== 'C'){
                    RecorridoMatx(MatC, cintaNueva, valMatx, actual_cinta);
                }
                else if(matrizActual[i][j]== 'D'){
                    RecorridoMatx(MatD, cintaNueva, valMatx, actual_cinta);
                }
            }
        }
        return(cintaNueva);
    } 
}

