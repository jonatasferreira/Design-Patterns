/**
* ConcreteProduct (EmissorSincronoEmail)
* Uma implementa��o particular do tipo de objeto a ser criado.
*/
public class EmissorSincronoEmail implements Emissor {
	public void envia(String message){
		System.out.println ("Enviando por email a mensagem: ");
		System.out.println(message);
	}
}