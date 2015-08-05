/**
* AbstractFactory (ComunicadorFactory)
* Interface que define as assinaturas dos métodos responsáveis pela criação dos objetos uma família.
*/
public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}