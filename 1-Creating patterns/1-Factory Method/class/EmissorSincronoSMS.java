/**
* ConcreteProduct (EmissorSincronoSMS)
* Uma implementação particular do tipo de objeto a ser criado.
*/
public class EmissorSincronoSMS implements Emissor{
	public void envia(String message){
		System.out.println("Enviando por SMS a mensagem: ");
		System.out.println(message);
	}
}