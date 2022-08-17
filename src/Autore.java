public class Autore {
	private int annoNascita;
	private String nome;
	public Autore(String nome, int annoNascita) {
		this.nome = nome;
		this.annoNascita = annoNascita;
	}
	public String getNome() {
		return this.nome;
	}
	public int getAnnoNascita() {
		return this.annoNascita;
	}
	public boolean equals(Object o) {
		if(o.getClass()==null || this.getClass()!=o.getClass()) {
			return false;
		}
		Autore a = (Autore) o;
		return this.getAnnoNascita()==a.getAnnoNascita() && this.getNome().equals(a.getNome());
	}
	
	public int hashCode() {
		return this.getAnnoNascita()+this.getNome().hashCode();
	}

}