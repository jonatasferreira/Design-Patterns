/**
* Client
* Interage com os objetos através da interface definida por Target.
*/
public class TesteControleDePonto {
	public static void main ( String[] args ) throws InterruptedException {
		ControleDePonto controleDePonto = new ControleDePontoAdapter() ;  // Com o uso do adapter, altera apenas a instanciação da controle.
		Funcionario funcionario = new Funcionario ( "Marcelo Martins" ) ;
		controleDePonto.registraEntrada( funcionario ) ;
		Thread.sleep(3000) ;
		controleDePonto.registraSaida( funcionario ) ;
	}
}