	import java.util.Scanner;
public class DesafioOperadores {
	// Programa Java para leer algunos valores usando la clase Scanner e imprimir 

	  public static void main(String[] args) {
	Scanner console = new Scanner(System.in);

	        System.out.println("Introduce tu peso en KG:"); 
	        double peso = console.nextDouble();
	        System.out.println("Introduce tu altura en M:");
	        double altura = console.nextDouble();
	 
	        double imc = peso/(altura*altura);
	 
	        if(imc>=22 && imc<=24.9){
	            System.out.println("Estas normal ntp");
	        }
	        else if(imc>=25 && imc<=29.9){
	            System.out.println("Tienes sobrepeso, cuidate tqm");
	        }
	        else if(imc>=30 && imc<=34.9){
	            System.out.println("Tienes obesidad tipo 1, cuidate tqm");
	        }
	        else{
	            System.out.println("Estas fuera del rango. Cuida tu salud tqm <3");
	        }
	 
	        console.close();

	  }
	}
