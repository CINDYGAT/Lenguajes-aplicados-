import java.util.Random;

public class Frandom {
    public static void main(String[] args) {
        int contador=0;
        char aleatoriedad;
        char cinta[]= new char[36];
//        Random random = new Random();

        System.out.printf("[");
        for (int i = 0; i < 36; i++) { 
            aleatoriedad= Aleatoriedad();    
//vamos a restringir que solo exista una F en el vector
            if(aleatoriedad=='F' && contador==0){ //si el elemento random es el primer F, escribirlo
                cinta[i]=aleatoriedad;
                contador=contador+1;
            }       
            else if(aleatoriedad == 'F' && contador>0){ //si el elemento random es no es el primer F, hacer lo sig
               // int flag=0;
                do{//verificar si en la primera iteracion F cambia a otro valor
                    aleatoriedad= Aleatoriedad();   //instruccion para volver a randomizar
                    if(aleatoriedad=='F'){
                        Aleatoriedad();
                       // flag=0;
                    }
                    else if(aleatoriedad != 'F'){
                        cinta[i]=aleatoriedad;
                       // flag=1;
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
    }
    public static char Aleatoriedad() {//propio de random
        Random random = new Random();
        String setOfCharacters = "01LRNF";
        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);
        return(randomChar);
    }
    //creando la matriz A y mostrandola
    }

