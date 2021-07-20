package Principal;

import Paciente.Comum;
import Paciente.Paciente;
import Medico.Medico;
import Medico.Pediatra;
import Administrador.Administrador;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	private static Administrador minhaAgenda;
	private static Scanner entrada;

	public static void main(String[] args) {
		
		minhaAgenda = new Administrador();
		entrada = new Scanner(System.in);

		int opcao = -1;
		
		while (opcao != 0) {
			
			opcao = menu();
			
			switch(opcao) {
				case 1:{
					adicionarContato();
					break;
				}
				case 2:{
					buscarContato();
					break;
				}
				case 3:{
					atualizarContato();
					break;
				}
				case 4: {
					removerContato();
					break;
				}
				case 5:{
					listarContatos();
					break;
				}
				case 0:{
					System.out.println("Obrigado por usar a agenda");
					System.exit(opcao);
				}
				default: {
					System.out.println("Opcao "+ opcao+ " invalida");
					break;
				}
			}
			
			
		}
		entrada.close();

	}
	


	private static int menu() {
		System.out.println("\n");
		System.out.println("Digite uma opcao:");
		System.out.println("1- Adicionar contato");
		System.out.println("2- Buscar contato");
		System.out.println("3- Atualizar contato");
		System.out.println("4- Remover contato");
		System.out.println("5- Listar todos os contatos");
		System.out.println("0- Sair");
		System.out.println("----------------");

		return Integer.parseInt(entrada.nextLine());
	}
	
	private static void adicionarContato() {
		System.out.println("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite a idade: ");
		String idade = entrada.nextLine();
		
		System.out.println("Digite o sexo: ");
		String sexo = entrada.nextLine();
		
		System.out.println("Digite o sintoma: ");
		String sintoma = entrada.nextLine();
		
		Paciente contato = minhaAgenda.adicionarContato(nome, idade, sexo, sintoma);
		
		System.out.println("----------------");
		System.out.println(contato);
		System.out.println("----------------");
		
		System.out.println("Contato cadastrado com sucesso");
	}
	
	private static void atualizarContato() {
		System.out.println("Digite um nome: ");
		Paciente contato = minhaAgenda.buscarContato(entrada.nextLine());
		if(contato == null) {
			System.out.println("Contato nao encontrado");
		}
		else {
			System.out.println("Contato encontrado");
			System.out.println("Digite o nome: ");
			String nome = entrada.nextLine();
			
			System.out.println("Digite a idade: ");
			String idade = entrada.nextLine();
			
			System.out.println("Digite o sexo: ");
			String sexo = entrada.nextLine();
			
			System.out.println("Digite o sintoma: ");
			String sintoma = entrada.nextLine();
			
			contato = minhaAgenda.atualizarContato(contato, nome, idade, sexo, sintoma);
			
			System.out.println("----------------");
			System.out.println(contato);
			System.out.println("----------------");
		}
	}
	
	private static void buscarContato() {
		System.out.println("Digite um nome: ");
		Paciente contato = minhaAgenda.buscarContato(entrada.nextLine());
		if(contato == null) {
			System.out.println("Contato nao encontrado");
		}
		else {
			System.out.println("----------------");
			System.out.println(contato);
			System.out.println("----------------");
		}
	}
	
	private static void removerContato() {
		System.out.println("Digite um nome: ");
		boolean resultado = minhaAgenda.removerContato(entrada.nextLine());
		if(resultado == false) {
			System.out.println("Contato nao encontrado");
		}
		else {
			System.out.println("Contato removido");
		}
	}
	
	private static void listarContatos() {
		for(Paciente contato: minhaAgenda.getMeusContatos()) {
			System.out.println(contato);
		}
	}

}