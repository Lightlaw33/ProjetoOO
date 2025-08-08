
public class ClassePessoas {
	String nomeAt;
	String documentoAt;
	float rendaAt;
	
	//CONSTRUTOR 1
	public ClassePessoas() {

}
	
	public ClassePessoas(String nomePar, String documentoPar, float rendaPar) {
		this.nomeAt = nomePar;
		this.documentoAt = documentoPar;
		this.rendaAt = rendaPar;
}
	//setters (alterar dados)
	public void alterarNome(String nomePar ) {
		this.nomeAt = nomePar;
	}
	public void alterardocumento(String documentoPar ) {
		this.documentoAt = documentoPar;
	}
	public void alterarRenda(float rendaPar ) {
		this.rendaAt = rendaPar;
	}
}