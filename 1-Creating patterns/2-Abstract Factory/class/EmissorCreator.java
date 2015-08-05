/**
* Creator (ReceptorCreator) Pessonagem do padr�o Factory Method.
* Classe ou interface que define a assinatura do m�todo respons�vel pela cria��o do produto.
* Pode possuir uma implementa��o padr�o do m�todo de cria��o do produto.
*/
public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Emissor create( int tipoDoEmissor ) {
		if( tipoDoEmissor == EmissorCreator.VISA ) {
			return new EmissorVisa () ;
		} else if ( tipoDoEmissor == EmissorCreator.MASTERCARD ) {
			return new EmissorMastercard () ;
		} else {
			throw new IllegalArgumentException ( "Tipo de emissor n�o suportado" );
		}
	}
}