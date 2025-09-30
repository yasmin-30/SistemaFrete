package sistemaFrete;

public class main {

	public static void main(String[] args) {
		double total;
		ServicoDeEntrega entrega1 = new ServicoDeEntrega();
		entrega1.adicionarFretavel(new Funcionario("Ana"));
		entrega1.adicionarFretavel(new Carro("ABC", 1998));
		total = entrega1.calcularCustoTotal(10);
		System.out.println("O pedido já está sendo entregue!\nO valor do frete é: R$ " + total);
		System.out.println("");
		
		ServicoDeEntrega entrega2 = new ServicoDeEntrega();
		entrega2.adicionarFretavel(new Autonomo("Joao"));
		entrega2.adicionarFretavel(new Motocicleta("ABC", 1998));
		total = entrega2.calcularCustoTotal(25);
		System.out.println("O pedido já está sendo entregue!\nO valor do frete é: R$ " + total);
	}

}
