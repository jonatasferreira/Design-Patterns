/**
* Creator (ReceptorCreator) Pessonagem do padr�o Factory Method.
* Classe ou interface que define a assinatura do m�todo respons�vel pela cria��o do produto.
* Pode possuir uma implementa��o padr�o do m�todo de cria��o do produto.
*/
public class ReceptorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Receptor create( int tipoDoReceptor ) {
		if( tipoDoReceptor == ReceptorCreator.VISA ) {
			return new ReceptorVisa ();
		} else if( tipoDoReceptor == ReceptorCreator.MASTERCARD ) {
			return new ReceptorMastercard ();
		} else {
			throw new IllegalArgumentException ( "Tipo de receptor n�o suportado." );
		}
	}
}