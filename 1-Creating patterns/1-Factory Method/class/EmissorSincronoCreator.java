/**
* ConcreteCreator (EmissorSincronoCreator)
* Classe que implementa ou sobrescreve o método de criação do produto.
*
* Especialização: Definindo subclasses para expecializar o criador.
* Nesse exemplo de expecialização, o sistema pode trabalhar com dois tipos diferentes de envio de mensagens:
* sincrono com esta classe e assincrono com a classe 'EmissorAssincronoCreator'.
*/
public class EmissorSincronoCreator extends EmissorCreator {
	public Emissor create( int tipoDeEmissor ) {
		if( tipoDeEmissor == EmissorCreator.SMS ) {
			return new EmissorSincronoSMS () ;
		} else if( tipoDeEmissor == EmissorCreator.EMAIL ) {
			return new EmissorSincronoEmail() ;
		} else if( tipoDeEmissor == EmissorCreator.JMS ) {
			return new EmissorSincronoJMS() ;
		} else {
			throw new IllegalArgumentException( " Tipo de emissor não suportado " ) ;
		}
	}
}