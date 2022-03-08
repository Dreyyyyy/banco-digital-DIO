
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Andrey Naligatski Dias");
		
		Conta contaCorrente = new Conta(cliente);
		Conta contaPoupanca = new Conta(cliente);
	
		contaCorrente.depositar(100);
		contaCorrente.transferir(20, contaPoupanca);
		
		contaCorrente.extrato();
		contaPoupanca.extrato();
	}
}
