package exercicio2;

public class Colaborador {

	protected String nome;
	protected String endereco;
	protected String dataInicio;

	public Colaborador(String nome, String endereco, String dataInicio) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataInicio = dataInicio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String exibirColaborador() {
		return String.format("%s - %s - %s ", nome, endereco, dataInicio);
	}

}
