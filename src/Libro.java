import java.util.*;
public class Libro {
	private Set<Autore> autori;
	private String titolo;
	public Libro(String titolo) {
		this.titolo = titolo;
		this.autori = new HashSet<Autore>();
	}
	public void addAutore(Autore autore){
		this.autori.add(autore);
	}
	public Set<Autore> getAutori() {
		return Collections.unmodifiableSet(this.autori);
	}
	public String getTitolo(){
		return this.titolo;
	}
	
	public int hashCode() {
		int a=0;
		for(Autore aut : autori) {
			a += aut.hashCode();
		}
		return this.titolo.hashCode() + a;
	}
	
	public boolean equals(Object o) {
		if(o.getClass()== null && this.getClass()!=o.getClass()) {
			return false;
		}
		Libro l = (Libro) o;
		return this.getTitolo()==l.getTitolo() && this.getAutori()==l.getAutori();
	}
}