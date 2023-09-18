import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Sistema de Cadastros!\n\nDigite a quantidade de alunos a serem cadastrados: ");
		
		int quantidadeAlunos;
		quantidadeAlunos = entrada.nextInt();
		
		Aluno[] alunos = new Aluno[quantidadeAlunos];
		
		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = new Aluno();
			alunos[i] = aluno;
			
			Venda venda = new Venda();
			alunos[i].setVenda(venda);
		}
		
		for (int i = 0; i < quantidadeAlunos; i++) {
			entrada.nextLine(); //limpar o buffer de entrada
			
			System.out.println("Digite o nome do aluno: ");
			alunos[i].setNome(entrada.nextLine());
			
			System.out.println("Digite a matrícula do aluno: ");
			alunos[i].setMatricula(entrada.nextInt());
			
			System.out.println("Digite a quantidade de cachorros quentes comprados: ");
			int quantidadeCachorrosQuentes;
			quantidadeCachorrosQuentes = entrada.nextInt();
			
			CachorroQuente[] cachorrosQuentes = new CachorroQuente[quantidadeCachorrosQuentes];
			alunos[i].getVenda().setCachorrosQuentes(cachorrosQuentes);
			
			for (int j = 0; j < quantidadeCachorrosQuentes; j++) {
				CachorroQuente cachorroQuente = new CachorroQuente();
				alunos[i].getVenda().getCachorrosQuentes()[j] = cachorroQuente;
			}
			
			for(int j=0;j<quantidadeCachorrosQuentes;j++) {
				entrada.nextLine(); //limpar o buffer de entrada
				
				Proteina proteina = new Proteina();
				Queijo queijo = new Queijo();
				alunos[i].getVenda().getCachorrosQuentes()[j].setProteina(proteina);
				alunos[i].getVenda().getCachorrosQuentes()[j].setQueijo(queijo);
				
				System.out.println("Digite a proteína do cachorro-quente "+(j+1)+": ");
				alunos[i].getVenda().getCachorrosQuentes()[j].getProteina().setNome(entrada.nextLine());
				
				System.out.println("Digite o queijo do cachorro-quente: "+(j+1)+": ");
				alunos[i].getVenda().getCachorrosQuentes()[j].getQueijo().setNome(entrada.nextLine());
				
				System.out.println("Digite a quantidade de adicionais: ");
				int quantidadeAdicionais;
				quantidadeAdicionais = entrada.nextInt();
				
				for(int k=0;k<quantidadeAdicionais;k++) {
					entrada.nextLine(); //limpar o buffer de entrada
					
					Adicional[] adicionais = new Adicional[quantidadeAdicionais];
					alunos[i].getVenda().getCachorrosQuentes()[j].setAdicionais(adicionais);
					Adicional adicional = new Adicional();
					alunos[i].getVenda().getCachorrosQuentes()[j].getAdicionais()[k] = adicional;
					System.out.println("Digite o adicional "+(k+1)+": ");
					alunos[i].getVenda().getCachorrosQuentes()[j].getAdicionais()[k].setNome(entrada.nextLine());
				}
			}
			
			Bebida bebida = new Bebida();
			alunos[i].getVenda().setBebida(bebida);
			
			System.out.println("Digite a bebida: ");
			alunos[i].getVenda().getBebida().setNome(entrada.nextLine());
		}
		
	}

}
