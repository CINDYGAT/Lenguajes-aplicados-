public class prueba {
    public static void main(String[] args) {
        char matrizActual[][]={{'0','1','L'}, {'R','1','L'}, {'0','B','F'}};
        int cinta[]={0,1,0,0,1,1,0,1};
        RecorridoMatriz(matrizActual, cinta, 0);
        
    }
    public static void RecorridoMatriz(char[][] matG, int[] cinta, int posicionVector) {
        char matrizB[][]={{'1', '0', 'R'}, {'R','0','L'},{'1','C', 'L'}};
        char matrizC[][]={{'R', 'R', 'R'}, {'L','1','L'},{'1','L', '0'}};
        char matrizActual[][]=matG;
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
                    System.out.println("\nAhora en Matriz B\n");
                    RecorridoMatriz(matrizB, cintaNueva, actual_cinta);
                }
                else if(matrizActual[i][j]== 'C'){
                    System.out.println("\nAhora en Matriz C\n");
                    RecorridoMatriz(matrizC, cintaNueva, actual_cinta);
            }
        }
        // System.out.printf("[");
        // return(cintaNueva);
    }

}
}
