# workshop-poo-2018-ex2
1.  Implementar um método público para depositar e levantar para cada um dos tipos de conta, no entanto cada uma tem um comportamento diferente:
   
	1.  A Conta Crédito quando levanta valor subtrai a variável valorPorDebitar e quando deposita vai para o saldo da conta.
	   
	2.  A Conta Débito pode sempre depositar mas só pode levantar se o saldo da conta for positivo.
	   
	3.  A Conta Poupança comporta-se como a Conta Débito no entanto cada levantamento devemos incrementar o número de levantamentos e se este exceder o permitido devemos cancelar a operação.
    

2.  Percorrer um array de contas bancárias e realizar levantamentos em todas as contas, independentemente do seu tipo.