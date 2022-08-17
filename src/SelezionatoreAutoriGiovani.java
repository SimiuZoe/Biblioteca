import java.util.LinkedList;
import java.util.List;

public class SelezionatoreAutoriGiovani implements Selezionatore {
	@Override
	public List<Autore> eseguiSelezione(List<Libro> libriInBiblioteca) {
		List<Autore> autori = new LinkedList<Autore>();
		for(Libro libro : libriInBiblioteca) {
			for(Autore aut: libro.getAutori()) {
				if(aut.getAnnoNascita()>= 2000) {
					autori.add(aut);
				}
			}
		}
		return autori;
	}
}
