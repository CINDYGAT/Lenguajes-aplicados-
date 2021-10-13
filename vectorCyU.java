//El if anidado es <=3, ya que cuando counter1=0, el vector se escribe y se aumenta en 1. 
//llevamos un cero. counter1=0-->counter1=1
//si vuelve a ser 0, entonces lo escribe y counter1=2
//Llevamos dos ceros. counter1=1-->counter1=2
//si vuelve a ser 0, entonces lo escribe y counter1=3
//Llevamos tres ceros. counter1=2-->counter1=3
//si vuelve a ser 0, entonces lo escribe y counter1=4
//Llevamos cuatro ceros. counter1=3-->counter1=4
//SI SE TOMASE <=4
//entonces para counter<=4, todavia entraria al if una vez mas. 
//entonces lo escribe y counter1=5
//Llevamos cinco ceros. counter1=4-->counter1=5
//si counter1<=4, entonces aun entra al ciclo if y se escribe el valor una vez mas. 

public class vectorCyU {
    public static void main(String[] args) {
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
    }
    public static int cintaRandom() {
        int min = 0;
		int max = 2;

        int getRandomValue = (int) (Math.random()*(max-min)) + min;
        return(getRandomValue);
    }
}