/**
* ConcreteFactory (VisaComunicadorFactory, MastercardComunicadorFactory)
* Classe que implementa os m�todos de cria��o dos objetos de uma fam�lia.
*
* Abstract Factory + Factory Method
*/
public class MastercardComunicadorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	public Emissor createEmissor() {
		return this.emissorCreator.create( EmissorCreator.MASTERCARD );  // Factory Method
	}

	public Receptor createReceptor() {
		return this.receptorCreator.create( ReceptorCreator.MASTERCARD );  // Factory Method
	}
}