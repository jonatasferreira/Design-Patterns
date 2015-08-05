/**
* Adaptee (ControleDePontoNovo)
* Classe que define o novo objeto a ser utilizado.
*/
public class ControleDePontoNovo {
	public void registra( Funcionario f, boolean entrada ) {
		Calendar calendar = Calendar.getInstance() ;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s" ) ;
		String format = simpleDateFormat.format( calendar.getTime() ) ;

		if ( entrada == true ) {
			System.out.println ( "Entrada: " + f.getNome() + " �s " + format ) ;
		} else {
			System.out.println ( "Sa�da: " + f.getNome() + " �s " + format ) ;
		}
	}
}