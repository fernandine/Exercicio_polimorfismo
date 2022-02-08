package entidade;

public class Terceirizado extends Funcionario {

	private double taxaAdicional;
	
	public Terceirizado() {
	super();
	}

	public Terceirizado(String nome, Integer horas, double valorPorHora, double taxaAdicional) {
		super(nome, horas, valorPorHora);
		this.taxaAdicional = taxaAdicional;
	}

	public double getTaxaAdicional() {
		return taxaAdicional;
	}

	public void setTaxaAdicional(double taxaAdicional) {
		this.taxaAdicional = taxaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + taxaAdicional * 1.1;
	}
}
