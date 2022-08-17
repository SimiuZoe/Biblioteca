import java.util.*;
public class Biblioteca {
	private Map<String, Libro> codice2libro;

	public Biblioteca() {
		this.codice2libro = new HashMap<String, Libro>();
	}
	public void addLibro(String codice, Libro libro) {
		this.codice2libro.put(codice, libro);
	}
	//	public List<Autore> autoriGiovani() {
	//		List<Autore> autoriGiovani = null;
	//		// codice omesso
	//		return autoriGiovani;
	//	}

	public List<Autore> seleziona(Selezionatore selezionatore){
		List<Libro> libriInBiblioteca = new LinkedList<Libro>();
		libriInBiblioteca = (List<Libro>)codice2libro.values();
		List<Autore> selezione = selezionatore.eseguiSelezione(libriInBiblioteca);
		return selezione;

	}

	public Map<Autore, Set<Libro>> autore2libri() {
		Map<Autore, Set<Libro>> autore2libri = new HashMap<Autore, Set<Libro>>();
		for(Libro libro: codice2libro.values()) {
			for(Autore autore: libro.getAutori()) {
				if(autore2libri.containsKey(autore)) {
					autore2libri.get(autore).add(libro);
				} else {
					Set<Libro> insiemeLibri = new HashSet<Libro>();
					insiemeLibri.add(libro);
					autore2libri.put(autore, insiemeLibri);
				}
			}
		}
		return autore2libri;
	}
	// altri metodi omessi
}