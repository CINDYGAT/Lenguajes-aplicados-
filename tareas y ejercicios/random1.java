public class random1 {
    public static void main(String[] args) {
        int min = 0;
		int max = 2;
        int cinta[]= new int[8];

		for(int i = min; i <8; i++) {
			int getRandomValue = (int) (Math.random()*(max-min)) + min;
            cinta[i]=getRandomValue;
			//System.out.println(getRandomValue);
        }

        //Mostrando los valores de la cinta

        for(int i = min; i <8; i++) {
			System.out.println(cinta[i]);
        }
    }
}
