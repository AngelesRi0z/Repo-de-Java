
package funciones;
import java.util.Scanner;
public class parte1 {
public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
        String name;
        String lname;
        
        System.out.print("Enter your name: ");
        name = console.nextLine();
        System.out.print("Enter your last name: ");
        lname = console.nextLine();
        
        console.close();
        
        int n = name.length();
        
        for (int i=0; i<=n-1;i++) {
        	System.out.println(name.charAt(i));
        }
        
        System.out.println(name + " " +lname);
        System.out.println(n);
        
        
	}
}
