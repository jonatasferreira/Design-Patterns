/**
* ConcreteProduct (EmissorVisa, ReceptorVisa, EmissorMastercard, ReceptorMastercard)
* Implementa��o particular de um tipo de produto.
*/
public class ReceptorMastercard implements Receptor {
	public String recebe() {
		System.out.println( "Recebendo mensagem da Mastercard." );
		String mensagem = "Mensagem da Mastercard";
		return mensagem;
	}
}