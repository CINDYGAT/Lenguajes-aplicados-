import java.util.Random;
public class intentoProyecto {
    public static void main(String[] args) {
        char cinta[]= new char[36];
        Random random = new Random();

        String setOfCharacters = "01LRNF";

        System.out.printf("[");
        for (int i = 0; i < 36; i++) {
            int randomInt = random.nextInt(setOfCharacters.length());
            char randomChar = setOfCharacters.charAt(randomInt);
            cinta[i]=randomChar;
            System.out.printf("%c, ",randomChar);
            
        }
        System.out.printf("]\n");

        //Imprimiendo el vector con los 36 random char
        System.out.println("El vector random generado es:");
        System.out.printf("["); //para agregar la llave inicial del vector
        for(int j=0; j< 36; j++){
            System.out.printf("%c, ",cinta[j]);
        }
        System.out.printf("]\n");

        MatrizA(cinta);
        MatrizB(cinta);
        MatrizC(cinta);
        MatrizD(cinta);
    }
    //creando la matriz A y mostrandola
    public static void MatrizA(char cinta[]){
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
    }
    //creando la matriz B
    public static void MatrizB(char cinta[]){
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
    }
    //creando la matriz C
    public static void MatrizC(char cinta[]){
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
    }
    public static void MatrizD(char cinta[]){
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
    }
}
