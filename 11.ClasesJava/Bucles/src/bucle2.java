import java.util.Scanner;
public class bucle2 {
	 public static void main(String[] args) {
		   Scanner console = new Scanner(System.in);
		   int num;
		 
		   System.out.print("Enter any positive integer: ");
		   num = console.nextInt();
		   console.close();
		 
		   int i = 0;
		 
		   int num1 = 0;
		   int num2 = 1;
		 
		   do {
		     System.out.println(i + " " + num1 + " ");
		     int sum = num1 + num2;
		     num1 = num2;
		     num2 = sum;
		     i++;
		   } while (i <= num);
		   {
		   }
		  
		 }

}
