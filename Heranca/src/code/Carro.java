package code;

public class Carro extends Veiculo{
	
	private int numDePortas;

	public Carro(String marca, String modelo, int ano, int numDePortas) {
		super(marca, modelo, ano);
		this.numDePortas = numDePortas;
	}

	public int getNumDePortas() {
		return numDePortas;
	}

	public void setNumDePortas(int numDePortas) {
		this.numDePortas = numDePortas;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Número de portas: " + numDePortas);
		
	}
	

}
