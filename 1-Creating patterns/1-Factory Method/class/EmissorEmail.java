/**
* ConcreteProduct (EmissorEmail)
* Uma implementação particular do tipo de objeto a ser criado.
*/
public class EmissorEmail implements Emissor {
	public void envia(String message){
		System.out.println ("Enviando por email a mensagem: ");
		System.out.println(message);
	}
}