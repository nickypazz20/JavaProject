package MultaVeiculo;

import java.util.Scanner;

import MultaDeVeiculo.MultaVeiculo;

public class TesteMultaVeiculo {
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		
		MultaVeiculo mv = new MultaVeiculo();
	
		System.out.println("Tipo do veiculo (passeio, caminhao): ");
		mv.setTipoVeiculo(entrada.nextLine());
		
		System.out.println("Velocidade maxima da via: ");
		mv.setVelocidadeMaxima(entrada.nextInt());
		
		System.out.println("Velocidade do veiculo: ");
		mv.setVelocidadeVeiculo(entrada.nextInt());
		
		mv.Multa();		
	}
}

