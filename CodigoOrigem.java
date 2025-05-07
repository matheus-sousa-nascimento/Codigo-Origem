/*
 * CodigoOrigem.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class CodigoOrigem {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double valProduto;
		
		int    codigo	 ;
		
		System.out.print("Digite o valor do produto: ");
		valProduto = entrada.nextDouble();
		
		System.out.print("Digite o codigo do produto: ");
		codigo = entrada.nextInt();
		
		double valorFrete = 0.0;
		double valorFinal;
		
		switch (codigo) {
			case 1:
				
				valorFrete = valProduto * 0.1;
				valorFinal = valProduto + (valProduto * 0.1);
				System.out.print("O valor do produto e R$"+ valProduto +" e sua procedencia e do norte o seu frete sera de R$"+valorFrete+
				" e o seu valor final sera de R$"+valorFinal);
				break;
			case 2:
			case 5:
			case 9:
				valorFrete = (valProduto * 0.03);
				valorFinal = valProduto + (valProduto * 0.03);
				System.out.print("O valor do produto e R$"+ valProduto +" e sua procedencia e do sul o seu frete sera de R$"  +valorFrete+
				" e o seu valor final sera de R$"+valorFinal);
				break;
			case 3:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				valorFrete = (valProduto * 0.012);
				valorFinal = valProduto + (valProduto * 0.012);
				System.out.print("O valor do produto e R$"+ valProduto +" e sua procedencia e do leste o seu frete sera de R$"+valorFrete+
				" e o seu valor final sera de R$"+valorFinal);
				break;
			case 7:
			case 20:
				valorFrete = (valProduto * 0.073);
				valorFinal = valProduto + (valProduto * 0.073);
				System.out.print("O valor do produto e R$"+ valProduto +" e sua procedencia e do oeste o seu frete sera de R$"+valorFrete+
				" e o seu valor final sera de R$"+valorFinal);
				break;
			default:
				valorFrete = (valProduto * 0.222);
				valorFinal = valProduto + (valProduto * 0.222);
				System.out.print("O valor do produto e R$"+ valProduto +" e sua procedencia e do importado o seu frete sera de R$"+valorFrete+
				" e o seu valor final sera de R$"+valorFinal);
				break;
		}
	}
}

