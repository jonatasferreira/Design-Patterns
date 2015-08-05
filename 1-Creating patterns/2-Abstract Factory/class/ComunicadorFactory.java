/**
* AbstractFactory (ComunicadorFactory)
* Interface que define as assinaturas dos m�todos respons�veis pela cria��o dos objetos uma fam�lia.
*/
public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}