import java.util.Scanner;

public class Javas_egna_klasser {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange triangelns höjd: ");
		String heigth = scan.nextLine();
		System.out.print("Ange basen på triangeln: ");
		String base = scan.nextLine();
		
		scan.close();
		
		double doubleHeigth = Double.parseDouble(heigth);
		double doubleBase = Double.parseDouble(base);
			
		double hypotenuse = Math.hypot(doubleHeigth, doubleBase);
		System.out.print("Hypotenusan av triangeln: "+hypotenuse);
		
		

			
	}

}