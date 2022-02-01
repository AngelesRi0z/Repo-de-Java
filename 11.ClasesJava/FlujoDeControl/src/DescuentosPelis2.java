import java.util.Scanner;
public class DescuentosPelis2 {
	 public static void main(String[] args) {
		 
		   Scanner s = new Scanner(System.in);
		    System.out.println("Introduce tu edad: ");
		    int age = s.nextInt();
		    System.out.println("Introduce el número de boletos: ");
		    int nTicket = s.nextInt();
		    int ticket = 7;
		    if (age>=5 && age<=60) {
		      if (nTicket==1) {
		        System.out.println("No hay descuento. Son 7 euros.");
		      } else {
		        System.out.println("Son " + ticket*nTicket*.7);
		      }
		    } else if (age<5) {
		      System.out.println("Tienes descuento del 60%, son " + ticket*.4);
		    } else {
		      System.out.println("Tienes descuento del 55%, son " + ticket*.45);
		    }
		 
		 }

}
