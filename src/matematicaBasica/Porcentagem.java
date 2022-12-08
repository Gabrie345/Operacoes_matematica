package matematicaBasica;

public class Porcentagem {
	
    public static void main(String[] args) {
    	
    	String quantosXporcentoDeUmValor = quantosXporcentoDeUmValor(50,500);
    	System.out.println(quantosXporcentoDeUmValor);
    	
    	String oValorXeQuantosPorcentoDoValorY = oValorXeQuantosPorcentoDoValorY(10, 100);
    	System.out.println("_______________________________________________________________________");
    	System.out.println(oValorXeQuantosPorcentoDoValorY);
    	
    	String quantosPorcentoAumentou = quantosPorcentoAumentou(83,125);
    	System.out.println("_______________________________________________________________________");
    	System.out.println(quantosPorcentoAumentou);
    	
    	String quantosPorcentoDiminuiu = quantosPorcentoDiminuiu(1000, 500);
    	System.out.println("_______________________________________________________________________");
    	System.out.println(quantosPorcentoDiminuiu);
    	
    	String oValorXeQuantosPorcentoDeY = oValorXeQuantosPorcentoDeY(10,50);
    	System.out.println("_______________________________________________________________________");
    	System.out.println(oValorXeQuantosPorcentoDeY);
    	
    	String aumentarXporcentoDeUmValor = AumentarXporcentoDeUmValor(10, 200);
    	System.out.println("_______________________________________________________________________");
    	System.out.println(aumentarXporcentoDeUmValor);
    	
    	
    	String diminuirXporcentoDeUmValor = DiminuirXporcentoDeUmValor(10, 200);
    	System.out.println("_______________________________________________________________________");
    	System.out.println(diminuirXporcentoDeUmValor);
    	
    	String diminuirXporcentoDeUmValorQualEraOValor = DiminuirXporcentoDeUmValorQualEraOValor(25, 15);    	
    	System.out.println("_______________________________________________________________________");
    	System.out.println(diminuirXporcentoDeUmValorQualEraOValor);
    	
    	
    	String aumentarXporcentoDeUmValorQualEraOValor = aumentarXporcentoDeUmValorQualEraOValor(15, 11);
    	System.out.println("_______________________________________________________________________");
    	System.out.println(aumentarXporcentoDeUmValorQualEraOValor);
    }
    
    // 50% de 500 = 250
    private static String quantosXporcentoDeUmValor(int porcentagem, int valor) {
    	int valorCalculado = porcentagem * valor/100;
    	return porcentagem + "% de " + valor + " é " + valorCalculado;
    	
    }
    
    //10 de 100 = 10%
    private static String oValorXeQuantosPorcentoDoValorY(int valorFracionado, int valorTotal) {
    	int valorCalculado = (valorFracionado * 100)/valorTotal;
    	return "O valor de " + valorFracionado + " é " +valorCalculado+"% de "+valorTotal;
    }
    
    //((1000*100)/500)-100
    private static String quantosPorcentoAumentou(int valorInicial, int ValorAposAumento) {
    	int valorCalculado = ((ValorAposAumento * 100)/valorInicial)-100;
    	return "O valor "+ valorInicial + " aumentou para " + ValorAposAumento + 
    			" a porcentagem que ele aumentou foi de " + valorCalculado+"%";
    }
    
    // ((500*100)/1000)
    private static String quantosPorcentoDiminuiu(int valorTotal, int ValorAposDiminuir) {
    	int valorCalculado = ((ValorAposDiminuir * 100)/valorTotal);
    	return "O valor "+ valorTotal + " diminuiu para "+ 
    			ValorAposDiminuir +" a porcentagem que diminuiu foi de " + valorCalculado+"%";
    }
    
    // ((10*5))
    private static String oValorXeQuantosPorcentoDeY(int valor, int SobreValorTotal) {
    	int valorCalculado =(valor*SobreValorTotal);
    	
    	return "O valor de "+valor+" e aumentou para "+ SobreValorTotal + 
    			" o percentual que ele aumentou foi de: "+ valorCalculado+"%";
    }
    
    //((10/100)*200)+10
    private static String AumentarXporcentoDeUmValor(double valor, int porcentagemAserAumentada) {
    	double valorCalculado = ((valor/100)*porcentagemAserAumentada)+valor;
    	
    	return "se você aumentar "+porcentagemAserAumentada+"% de "+valor +" você terá " + valorCalculado;
    }
    
    //10-((10/100)*200)
    private static String DiminuirXporcentoDeUmValor(double valor, int porcentagemAserDiminuida) {
    	double valorCalculado = valor-((valor/100)*porcentagemAserDiminuida);
    	
    	return "se você diminuir "+porcentagemAserDiminuida+"% de "+ valor +" você terá " + valorCalculado;
    }
    //(15*100)/(100-25)
    private static String DiminuirXporcentoDeUmValorQualEraOValor(double porcentagemDeDesconto, int numeroResultadoAposDesconto) {
    	
    	double valorCalculado = ((numeroResultadoAposDesconto*100)/(100-porcentagemDeDesconto));
    	
    	return  "O valor apos o desconto foi de " + numeroResultadoAposDesconto + 
    			" recebendo um percentual de desconto de " + porcentagemDeDesconto +"%"+
    			" O valor antes do desconto era de "+ valorCalculado;
    }
    //(11*100)/(15+100)
    private static String aumentarXporcentoDeUmValorQualEraOValor(double porcentagemDeDesconto, int numeroResultadoAposDesconto) {
    	
    	double valorCalculado = (numeroResultadoAposDesconto*100)/(porcentagemDeDesconto+100);
    	
    	return  "O valor aumentou em " + porcentagemDeDesconto +"% e passou a ser " + numeroResultadoAposDesconto +
    			" o valor antes de aumentar era "+ valorCalculado +"%" ;
    }

}
