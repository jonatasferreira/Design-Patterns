/**
* ConcreteProduct (EmissorAssincronoEmail)
* Uma implementa��o particular do tipo de objeto a ser criado.
*/
public class EmissorAssincronoEmail implements Emissor {
	public void envia(String message){
		System.out.println ("Enviando por email a mensagem: ");
		System.out.println(message);
	}
}