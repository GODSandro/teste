package code;

public class Moto extends Veiculo {
	
	private boolean temCarenagem;

	public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
		super(marca, modelo, ano);
		this.temCarenagem = temCarenagem;
	}

	public boolean isTemCarenagem() {
		return temCarenagem;
	}

	public void setTemCarenagem(boolean temCarenagem) {
		this.temCarenagem = temCarenagem;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Tem carenagem: " + (temCarenagem ? "sim" : "não"));		
	}
	

}
