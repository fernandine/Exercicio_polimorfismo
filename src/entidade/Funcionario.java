package entidade;

public class Funcionario {

	private String nome;
	private Integer horas;
	private Double valorPorHora;
	
	public void funcionario() {
		
	}

	public Funcionario(String nome, Integer horas, Double valorPorHora2) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora2;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public double pagamento() {
		return horas * valorPorHora;
	}
}
