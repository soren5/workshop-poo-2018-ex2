
public class ContaDebito extends ContaBancaria{

    public ContaDebito(double saldo, String numeroConta) {
		super(saldo, numeroConta);
	}

	@Override
	public String toString() {
		return "ContaDebito [saldo=" + saldo + ", \nnumeroConta=" + numeroConta + "]\n";
	}

	public void fazerDeposito(int valor) {
        
    }
    
    public void fazerLevantamento(int valor) {
    	
    }
    
}
