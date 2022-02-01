import java.util.Scanner;
public class DescuentoPelis1 {
	public static void main(String[] args) {
		 
		   Scanner s = new Scanner(System.in);
		   System.out.println("Introduce tu edad");
		   int age = s.nextInt();
		   int ticket = 7;
		   if (age >= 5 && age <= 60) {
		     System.out.println("No hay descuento para ti");
		   } else if (age < 5) {
		   System.out.println("tienes 60% de descuento, son"+ticket*.4);
		   }else{
		     System.out.println("tienes 55% de descuento, son"+ ticket*.45);
		   }
		 
		 }

}
