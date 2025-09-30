package sistemaFrete;

public class Funcionario extends Entregador implements Fretavel{
	
	public Funcionario(String nome) {
		super(nome);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return 5;
	}
}
