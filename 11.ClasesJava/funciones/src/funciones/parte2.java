package funciones;
import java.util.Scanner;
import java.lang.Math;

public class parte2 {
	static double suma(double a, double b) {
		return a + b;
	}
	
	static double resta(double a, double b) {
		return a - b;
	}
	
	static double multiplicar(double a, double b) {
		return a * b;
	}
	
	static double dividir(double a, double b) {
		return a / b;
	}
	
	static double cuadrado (double a) {
		return a*a;
	}
	
	static double raiz (double a) {
		return Math.sqrt(a);
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		double x = console.nextDouble();
		
		//Scanner console2 = new Scanner(System.in);
		System.out.println("Introduce el segundo n�mero: ");
		double y = console.nextDouble();
		
		System.out.println("Selecciona 1 para sumar");
		System.out.println("Selecciona 2 para restar");
		System.out.println("Selecciona 3 para multiplicar");
		System.out.println("Selecciona 4 para dividir");
		System.out.println("Selecciona 5 para obtener el cuadrado del primer n�mero");
		System.out.println("Selecciona 6 para obtener la ra�z del primer n�mero");
		int operacion = console.nextInt();
		
		switch(operacion) {
		case 1: 
			System.out.println("La suma es: " + suma(x, y));
		break;
		
		case 2:
			System.out.println("La resta es: " + resta(x, y));
		break;
		
		case 3:
			System.out.println("La multiplicaci�n es: " + multiplicar(x, y));
		break;
		
		case 4:
			System.out.println("La divisi�n es: " + dividir(x, y));
		break;
		
		case 5:
			System.out.println("El cuadrado del n�mero es: " + cuadrado(x));
		break;
		
		case 6:
			System.out.println("La ra�z cuadrada es: " + raiz(x));
		break;
			
		}
		
	}

}
