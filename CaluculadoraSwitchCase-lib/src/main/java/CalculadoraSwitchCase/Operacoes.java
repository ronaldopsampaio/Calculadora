package CalculadoraSwitchCase;

import java.util.Scanner;

public class Operacoes {

	private double i;
	private double j;
	private double resultado;
	String tipoOperacao;

	Scanner leitor = new Scanner(System.in);

	public void opcao() {

		System.out.println("Escolha: \n 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir");
		char novoCalculo = 's';
		int opcao = 0;

		try {
			opcao = leitor.nextInt();
		} catch (Exception e) {

		} 
				
		while (novoCalculo == 's' || novoCalculo == 'S') {
			
			try {
				
				switch (opcao) {
				case 1:
					somar();
					break;

				case 2:
					subtrair();
					break;

				case 3:
					multiplicar();
					break;

				case 4:
					dividir();
					break;

				default:
					System.out.println("Opção Inválida!");
					break;
				}

			} catch (Exception e) {
				System.out.println("Valor informado é inválido!");

			} finally {

				System.out.println("\nDeseja realizar novo Cálculo? S - SIM || N - NÃO");
				novoCalculo = leitor.next().charAt(0);

				if (novoCalculo != 'n' && novoCalculo != 'N') {
					opcao();
				} else if (novoCalculo == 'n' && novoCalculo != 'N') {
					System.out.println("Calculadora finalizada com Sucesso!");
				}
			}
		}
	}

	public void somar() {
		solicitarValores();
		resultado = i + j;
		tipoOperacao = "Soma";
		resultado();
	}

	public void subtrair() {
		solicitarValores();
		resultado = i - j;
		tipoOperacao = "Subtração";
		resultado();
	}

	public void multiplicar() {
		solicitarValores();
		resultado = i * j;
		tipoOperacao = "Multiplicação";
		resultado();
	}

	public void dividir() {
		solicitarValores();
		resultado = i / j;
		tipoOperacao = "Divisão";
		resultado();
	}

	public void solicitarValores() {
		System.out.println("Insira o primeiro valor: ");
		i = leitor.nextDouble();
		System.out.println("Insira o segundo valor: ");
		j = leitor.nextDouble();
	}
	
		public void resultado() {

		System.out.println("A operação escolhida foi: " + tipoOperacao);
		System.out.println("Resultado: " + resultado + ".");
	}
	
		
	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	public double getJ() {
		return j;
	}

	public void setJ(double j) {
		this.j = j;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
