/**
* Singleton (Configuracao)
* Classe que permite a cria��o de uma �nica inst�ncia e fornece um m�todo est�tico para recuper�la.
*/
public class Configuracao {
	private Map<String, String> propriedades ;
	private static Configuracao instance ;

	private Configuracao() {
		this.propriedades = new HashMap<String, String>() ;
		this.propriedades.put ( "time-zone" , "America/Sao_Paulo" ) ;
		this.propriedades.put ( "currency-code" , "BRL" ) ;
	}

	public static Configuracao getInstance() {
		if ( Configuracao.instance == null ) {
			Configuracao.instance = new Configuracao() ;
		}
		return Configuracao.instance ;
	}

	public String getPropriedade ( String nomeDaPropriedade ) {
		return this.propriedades.get ( nomeDaPropriedade ) ;
	}
}