package Bank;
import java.util.Scanner;
public class Relacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int cont;
		
		Banco banco = new Banco (6222, 15.00);
		Cliente cliente = new Cliente ("fellipe", banco);
		
		
		System.out.println("Olá senhor, deseja ver seu saldo? digite o N° da conta");
		cont = ler.nextInt();
		
		if (cont == banco.getNumero()) {
			System.out.println("O senhor Possui " +banco.getSaldo()+" reais em sua conta");
		}
		else {
			System.out.println("Este não é o código, por favor tente novamente");
		}

		
	}
	

}
