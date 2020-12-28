package cal.sr;
import java.util.Scanner;

public class Operaciones {
	public static int numero1;
	public static int numero2;
	
	
	public static void Num(int n1, int n2) {
		numero1 = n1;
		numero2 = n2;
	}
	
	public static int Suma() {
		return numero1 + numero2;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Inserta el primer numero a sumar: ");
		num1 = teclado.nextInt();
		System.out.print("Inserta el segundo numero a sumar: ");
		num2 = teclado.nextInt();
		
		Num(num1,num2);
		System.out.println("\n\tEl resultado es de: " + Suma());
	}
}
