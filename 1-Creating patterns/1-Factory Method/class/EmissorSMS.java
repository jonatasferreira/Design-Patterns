/**
* ConcreteProduct (EmissorSMS)
* Uma implementação particular do tipo de objeto a ser criado.
*/
public class EmissorSMS implements Emissor{
	public void envia(String message){
		System.out.println("Enviando por SMS a mensagem: ");
		System.out.println(message);
	}
}