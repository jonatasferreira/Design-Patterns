/**
* Creator (ReceptorCreator) Pessonagem do padrão Factory Method.
* Classe ou interface que define a assinatura do método responsável pela criação do produto.
* Pode possuir uma implementação padrão do método de criação do produto.
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
			throw new IllegalArgumentException ( "Tipo de emissor não suportado" );
		}
	}
}