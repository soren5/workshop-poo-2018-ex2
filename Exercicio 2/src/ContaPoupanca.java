public class ContaPoupanca extends ContaBancaria{
    int limiteLevantamentos;
    int levantamentosFeitos;
    
    public void fazerDeposito(int valor) {
    
    }
    
    public void fazerLevantamento(int valor) {
    	
    }

	public ContaPoupanca(double saldo, String numeroConta, int limiteLevantamentos, int levantamentosFeitos) {
		super(saldo, numeroConta);
		this.limiteLevantamentos = limiteLevantamentos;
		this.levantamentosFeitos = levantamentosFeitos;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [limiteLevantamentos=" + limiteLevantamentos + ", \nlevantamentosFeitos="
				+ levantamentosFeitos + ", \nsaldo=" + saldo + ", \nnumeroConta=" + numeroConta + "]\n";
	}
	
    
}