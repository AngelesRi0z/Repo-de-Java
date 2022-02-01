
import java.util.Scanner;

public class UserProfile {
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		//users name, age, gender, job preference, nationality and blood type
		System.out.println("Introduce el nombre");
		String name = console.nextLine();
		
		System.out.println("Introduce tu edad");
		int age = console.nextInt();
		console.nextLine();
		System.out.println("Introduce tu genero");
		String gender =console.nextLine();
		
		System.out.println("Introduce tu trabajo");
		String job =console.nextLine();
		
		System.out.println("Introduce tu nacionalidad");
		String nation =console.nextLine();
		
		System.out.println("Introduce tu tipo de sangre");
		String blood=console.nextLine();
		
		int year = 2022 - age;
		System.out.println("Hola soy "+name+" y tengo "+age+" años, me identifico con "+gender+" y me dedico a "+job+" mi nacionalidad es: "+nation+ " y mi tipo de sangre es "+blood);
		System.out.println( "naci en el año de "+year);
		
	}


}
