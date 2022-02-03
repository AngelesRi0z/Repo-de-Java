 import java.util.Scanner;
public class bucle1 {
	
	 public static void main(String[] args) {
		   Scanner console = new Scanner(System.in);
		          int num;
		          int i=1;
		 
		          System.out.print("Enter any positive integer: ");
		          num = console.nextInt();
		                 
		          System.out.println("Multiplication Table of " + num);
		         
		       
		 
		 while (i<=10){
		System.out.println(i*num);
		 i++;
		 }
		 }

}
