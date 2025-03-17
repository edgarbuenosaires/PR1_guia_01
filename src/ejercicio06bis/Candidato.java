package ejercicio06bis;

public class Candidato {
	private String nomCandidato;
	private String mailCandidato;

	public Candidato(String nom, String mail) {
		this.nomCandidato = nom;
		this.mailCandidato = mail;
	}

	@Override
	public String toString() {
		return "Candidato " + nomCandidato + ", mail " + mailCandidato + ".";
	}

}
