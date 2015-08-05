/**
* Product (Emissor)
* Classe ou interface que define o objeto a ser criado.
*
* Interface para padronizar essas classes e obter polimorfismo entre seus objetos.
*/
public interface Emissor {
	void envia( String mensagem );
}