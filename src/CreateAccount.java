
public class CreateAccount {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account();
		
		acc1.agency = 01;
		acc1.number = 111;
		acc1.holder = "Gustavo Henrique";
		acc1.balance = 1000;
		
		System.out.println("Ag�ncia: " + acc1.agency);
		System.out.println("N�mero: " + acc1.number);
		System.out.println("T�tular: " + acc1.holder);
		System.out.println("Saldo: " + acc1.balance);
	}
}
