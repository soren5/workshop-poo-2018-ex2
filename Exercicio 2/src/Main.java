import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		ContaCredito contaCredito = new ContaCredito(100, "1234", 0);
		ContaDebito contaDebito = new ContaDebito(0, "1333");
		ContaPoupanca contaPoupanca = new ContaPoupanca(100, "2255", 2, 0);

		/*Your code goes here*/
		
		System.out.println(contaCredito.toString());
		System.out.println(contaDebito.toString());
		System.out.println(contaPoupanca.toString());
	}
}
