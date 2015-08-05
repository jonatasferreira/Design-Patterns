/**
* ConcreteProduct (EmissorSincronoJMS)
* Uma implementação particular do tipo de objeto a ser criado.
*/
public class EmissorSincronoJMS implements Emissor {
	public void envia(String message){
		System.out.println("Enviando por JMS a mensagem: ");
		System.out.println(message);
	}
}