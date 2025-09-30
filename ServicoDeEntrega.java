package sistemaFrete;

import java.util.ArrayList;

public class ServicoDeEntrega {
	ArrayList<Fretavel> fretaveis = new ArrayList<Fretavel>();
	
	public void adicionarFretavel(Fretavel novoFretavel) {
		fretaveis.add(novoFretavel);
	}
	
	public double calcularCustoTotal(double distanciaEmKm) {
		double custoTotal = 0;
		for(Fretavel fretavel: fretaveis) {
			custoTotal += fretavel.calcularCustoFrete(distanciaEmKm);
		}
		
		return custoTotal;
	}
}
