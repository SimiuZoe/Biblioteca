import java.util.LinkedList;
import java.util.List;

public class SelezionatoreAutoriProlifici implements Selezionatore{

	@Override
	public List<Autore> eseguiSelezione(List<Libro> libriInBiblioteca) {
		List<Autore> autori = new LinkedList<Autore>();
		List<Autore> autProlifici = new LinkedList<Autore>();
		for(Libro l: libriInBiblioteca) {
			for(Autore a: l.getAutori()) {
				if(autori.contains(a)) {
					autProlifici.add(a);
				} else {
					autori.add(a);
				}
			}
		}
		return autProlifici;
	}

}
