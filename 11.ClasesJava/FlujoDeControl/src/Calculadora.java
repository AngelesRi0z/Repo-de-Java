import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		 
		   Scanner s = new Scanner(System.in);
		   System.out.println("Ingresa el monto de venta: ");
		   int sales = s.nextInt();
		   if (sales > 0 && sales <= 1000) {
		     System.out.println("La comisión es 0 pa' ti.");
		   } else if (sales > 1000 && sales <= 5000) {
		     System.out.println("La comisión es de " + sales * 0.1);
		   } else if (sales > 5000 && sales <= 10000) {
		     System.out.println("La comisión es de " + sales * 0.2);
		   } else {
		     System.out.println("La comisión es de " + sales * 0.3);
		   }
		 
		 }

}
