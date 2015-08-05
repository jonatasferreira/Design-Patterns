/**
* ConcreteProduct (EmissorJMS)
* Uma implementação particular do tipo de objeto a ser criado.
*/
public class EmissorJMS implements Emissor {
	public void envia(String message){
		System.out.println("Enviando por JMS a mensagem: ");
		System.out.println(message);
	}
}