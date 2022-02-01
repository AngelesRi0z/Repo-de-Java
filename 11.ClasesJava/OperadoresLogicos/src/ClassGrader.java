import java.util.Scanner;
public class ClassGrader {
	public static void main(String[] args) {
		   Scanner console = new Scanner(System.in);
		 
		        System.out.println("Ingresa un número entre 0-10:");
		        int numero = console.nextInt();
		 
		        if(numero>=0 && numero<=10){
		            if(numero<=3){
		                System.out.println("Failed");
		            }
		            else if(numero>3 && numero<=5){
		                System.out.println("Insufficient");
		            }
		            else if(numero>5 && numero<=8){
		                System.out.println("Good");
		            }
		            else{
		                System.out.println("Excellent Grade");
		            }
		        }
		        else{
		            System.out.println("Error solo pon números entre 0-10, entiende!!.");
		        }
		 
		        console.close();

		  }
}
