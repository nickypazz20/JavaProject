package MultaDeVeiculo;

public class MultaVeiculo {
	
    private String tipoVeiculo;
	private int velocidadeMaxima;
	private int velocidadeVeiculo;

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeVeiculo() {
		return velocidadeVeiculo;
	}

	public void setVelocidadeVeiculo(int velocidadeVeiculo) {
		this.velocidadeVeiculo = velocidadeVeiculo;
	}

	public void Multa() {
		if ((tipoVeiculo.equals("passeio") 
				&& velocidadeVeiculo > velocidadeMaxima * 1.1)
				|| (tipoVeiculo == "caminhao") 
				&& velocidadeVeiculo > velocidadeMaxima * 1.05) {
			System.out.println("Veiculo Multado");
			
		}
    }
}
