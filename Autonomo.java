package sistemaFrete;

public class Autonomo extends Entregador implements Fretavel{
	
	public Autonomo(String nome) {
		super(nome);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return 0.95*distanciaEmKm;
	}
}
