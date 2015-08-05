/**
* Target (ControleDePonto)
* Define a interface utilizada pelo Client.
*/
public class ControleDePonto {
	public void registraEntrada( Funcionario f ) {
		Calendar calendar = Calendar . getInstance() ;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("dd/MM/yyyy H:m:s" ) ;
		String format = simpleDateFormat.format ( calendar.getTime() ) ;
		System.out.println ( "Entrada: " + f.getNome() + " �s " + format ) ;
	}
	
	public void registraSaida ( Funcionario f ) {
		Calendar calendar = Calendar . getInstance () ;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("dd/MM/yyyy H:m:s" ) ;
		String format = simpleDateFormat.format ( calendar.getTime() ) ;
		System.out.println ( "Sa�da: " + f.getNome() + " �s " + format ) ;
	}
}