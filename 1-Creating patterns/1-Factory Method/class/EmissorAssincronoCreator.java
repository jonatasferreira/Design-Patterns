/**
* ConcreteCreator (EmissorAssincronoCreator)
* Classe que implementa ou sobrescreve o método de criação do produto.
*
*
* Especialização: Definindo subclasses para expecializar o criador.
* Nesse exemplo de expecialização, o sistema pode trabalhar com dois tipos diferentes de envio de mensagens:
* assincrono com esta classe e sincrono com a classe 'EmissorSincronoCreator'.
*/
public class EmissorAssincronoCreator extends EmissorCreator{
	public Emissor create( int tipoDeEmissor ){
		if( tipoDeEmissor == EmissorCreator.SMS ){
			return new EmissorAssincronoSMS();
		} else if( tipoDeEmissor == EmissorCreator.EMAIL ){
			return new EmissorAssincronoEmail();
		} else if( tipoDeEmissor == EmissorCreator.JMS ){
			return new EmissorAssincronoJMS();
		} else {
			throw new IllegalArgumentException( " Tipo de emissor não suportado " );
		}
	}
}