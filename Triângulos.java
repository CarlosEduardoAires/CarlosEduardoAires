import java.util.Scanner;

public class Tri�ngulos {
	public static void main(String[] args) {
try {
		Scanner dados = new Scanner(System.in);
		System.out.println("Calculando a �rea de Tri�ngulos Utilizando a F�rmula de Heron. \n");
		System.out.println("Tri�ngulo X");
		System.out.print("Digite o Lado A do Tri�ngulo x: ");
		double ladoA = dados.nextDouble();

		System.out.print("Digite o Lado B do Tri�ngulo x: ");
		double ladoB = dados.nextDouble();

		System.out.print("Digite o Lado C do Tri�ngulo x: ");
		double ladoC = dados.nextDouble();

		double soma_Dos_Lados_Do_Triangulo_X = ladoA + ladoB + ladoC;
		double area_Do_Triangulo_X = Equa��o1(soma_Dos_Lados_Do_Triangulo_X, ladoA, ladoB, ladoC);
		System.out.println("A �rea do Tri�ngulo X �: " + area_Do_Triangulo_X);
		System.out.println("===================================================================== \n");
		System.out.println("Tri�ngulo Y");

		System.out.print("Digite o Lado A do Tri�ngulo y: ");
		double ladoA2 = dados.nextDouble();

		System.out.print("Digite o Lado B do Tri�ngulo y: ");
		double ladoB2 = dados.nextDouble();

		System.out.print("Digite o Lado C do Tri�ngulo y: ");
		double ladoC2 = dados.nextDouble();

		double soma_Dos_Lados_Do_Triangulo_Y = ladoA2 + ladoB2 + ladoC2;
		double area_Do_Triangulo_Y = Equa��o1(soma_Dos_Lados_Do_Triangulo_Y, ladoA2, ladoB2, ladoC2);
		System.out.println("A �rea do Tri�ngulo Y �: " + area_Do_Triangulo_Y + "\n");
		System.out.println("===================================================================== \n");
		double maior_ou_menor = Maior_Menor(area_Do_Triangulo_X, area_Do_Triangulo_Y );
} catch(java.util.InputMismatchException exception){
	System.out.println("Informe um valor v�lido.");
}
	}

	public static double Equa��o1 (double p, double a, double b, double c) {
		if(p != 0) {
			p = p / 2;}
		double equacao_Da_Area_Antes_Da_Raiz = p * (p - a) * (p - b) * (p - c);
		double raiz = Math.sqrt(equacao_Da_Area_Antes_Da_Raiz);
		return raiz;
	}

	public static double Maior_Menor (double triangulo_X, double triangulo_y) {
		if(triangulo_X > triangulo_y) {
			System.out.println("O Tri�ngulo com Maior �rea �: Tri�ngulo X");		
		}
		if(triangulo_X < triangulo_y) {
			System.out.println("O Tri�ngulo com Maior �rea �: Tri�ngulo Y");	
		}
		if(triangulo_X == triangulo_y) {
			System.out.println("Ambos os Tri�ngulos S�o Id�nticos.");
		}
		return triangulo_y;
	}
}