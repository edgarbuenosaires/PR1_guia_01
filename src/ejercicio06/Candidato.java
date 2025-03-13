package ejercicio06;

public class Candidato {
	private String nombreCandidato;
	private String mailCandidato;

	public Candidato(String nombreCandidato, String mailCandidato) {
		super();
		this.nombreCandidato = nombreCandidato;
		this.mailCandidato = mailCandidato;
	}

	@Override
	public String toString() {
		return "Candidato [nombreCandidato=" + nombreCandidato + ", mailCandidato=" + mailCandidato + "]";
	}

}
