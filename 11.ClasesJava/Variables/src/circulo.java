import java.util.Scanner;
public class circulo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Ingresa el radio:");
		int radio = console.nextInt();
		double area = (3.1416*radio)*radio;
		double peri=(2*3.1416)*radio;
		
		System.out.println("El area del circulo es: "+ area+", y el perimetro es "+peri);
	}

}
