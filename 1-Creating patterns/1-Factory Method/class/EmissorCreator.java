/**
* Creator (EmissorCreator)
* Classe ou interface que define a assinatura do método responsável pela criação do produto.
* Pode possuir uma implementação padrão do método de criação do produto.
* 
* Classe Intermediária entre o código que deseja enviar uma mensagem e as classes que implementam os emissores. 
* Esse classe será a responsável pela escolha da classe concreta a ser utilizada para criar o tipo de emissor adequado.
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
			throw new IllegalArgumentException ( " Tipo de emissor não suportado " );
		}
	}
}