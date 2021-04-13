package src;

//classe Account com um construtor para validar e 
//inicializa a variavel de instância balance do tipo double

public class Account {
	private double balance; //variavel de instancia que aramzena o saldo
	
	//construtor
	public Account (double initialBalance) {
		if (initialBalance >0.0)   //valida que initialBalance é maior que 0.0
			balance = initialBalance; //caso não, o saldo é inicializado como valor padrão 0.0
	}//fim do construtor
	
	//credita (add) uma quantia a conta
	public void credit(double amount) {
		balance = balance + amount;   //adiciona quantia ao saldo
	}// fim do metodo credit
	
	public double getBalance() { //retorna o saldo da conta
		return balance; //fornece o valor de saldo ao metodo chamador
	}
	
}//fim da classe account
