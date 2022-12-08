package matematicaBasica;

import java.util.ArrayList;

public class Primo {

    public static void main(String[] args) {

    	ArrayList<Integer> listaDeNumerosprimos = listaTodosOsNumerosPrimosEntreIntervalo(1, 10);
        System.out.println(listaDeNumerosprimos);
        
        int numeroAserTestadao = 2;
        boolean resultadoIsPrimo = isPrimo(numeroAserTestadao);
        System.out.println("o numero " + numeroAserTestadao + " é primo? "+ resultadoIsPrimo);

    }

    private static ArrayList<Integer> listaTodosOsNumerosPrimosEntreIntervalo(int numeroInicial, int numeroFinal) {
        ArrayList<Integer> resultadoDosNumPrimos = new ArrayList<Integer>();
        
        for ( int numeroAserTestado = numeroInicial; numeroAserTestado <= numeroFinal ; numeroAserTestado++ ) {
        	if(isPrimo(numeroAserTestado)) resultadoDosNumPrimos.add(numeroAserTestado);
        }
        return resultadoDosNumPrimos;
    }
    
	private static boolean isPrimo(int numeroAserTestado) {
		 if (numeroAserTestado <= 1)
	            return false;
	        for (int i = 2; i < numeroAserTestado; i++)
	            if (numeroAserTestado % i == 0)
	                return false;
	        
	        return true;
	}

}