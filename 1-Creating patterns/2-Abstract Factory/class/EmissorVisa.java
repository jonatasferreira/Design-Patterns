/**
* ConcreteProduct (EmissorVisa, ReceptorVisa, EmissorMastercard, ReceptorMastercard)
* Implementa��o particular de um tipo de produto.
*/
public class EmissorVisa implements Emissor {
	public void envia( String mensagem ) {
		System.out.println( "Enviando a seguinte mensagem para a Visa: " );
		System.out.println( mensagem );
	}
}