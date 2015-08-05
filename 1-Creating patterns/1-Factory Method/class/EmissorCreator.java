/**
* Creator (EmissorCreator)
* Classe ou interface que define a assinatura do m�todo respons�vel pela cria��o do produto.
* Pode possuir uma implementa��o padr�o do m�todo de cria��o do produto.
* 
* Classe Intermedi�ria entre o c�digo que deseja enviar uma mensagem e as classes que implementam os emissores. 
* Esse classe ser� a respons�vel pela escolha da classe concreta a ser utilizada para criar o tipo de emissor adequado.
*/
public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	public Emissor create(int tipoDeEmissor) {
		if( tipoDeEmissor == EmissorCreator.SMS ) {
			return new EmissorSMS();
		}else if( tipoDeEmissor == EmissorCreator.EMAIL ) {
			return new EmissorEmail();
		}else if( tipoDeEmissor == EmissorCreator.JMS ) {
			return new EmissorJMS();
		} else {
			throw new IllegalArgumentException ( " Tipo de emissor n�o suportado " );
		}
	}
}