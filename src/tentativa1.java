import java.util.Scanner;

public class tentativa1 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a, b;
			
			System.out.println("Digite o primeiro valor: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo valor: ");
			b = scan.nextInt();
			
			int soma = soma(a, b);
			int subtracao = subtracao(a, b);
			double divisao = divisao(a, b);
			int multiplicacao = multiplicacao(a,b);
			
			System.out.println(soma);
			System.out.println(subtracao);
			System.out.println(divisao);
			System.out.println(multiplicacao);
			

	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
