/**
* ConcreteProduct (EmissorVisa, ReceptorVisa, EmissorMastercard, ReceptorMastercard)
* Implementação particular de um tipo de produto.
*/
public class ReceptorVisa implements Receptor {
	public String recebe () {
		System.out.println( "Recebendo mensagem da Visa." );
		String mensagem = "Mensagem da Visa";
		return mensagem;
	}
}