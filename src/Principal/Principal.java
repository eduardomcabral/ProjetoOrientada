package Principal;

import Paciente.Comum;
import Paciente.Paciente;
import Medico.Medico;
import Medico.Pediatra;
import Administrador.Administrador;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	private static Administrador meusPacientes;
	private static Scanner entrada;

	public static void main(String[] args) {
		
		meusPacientes = new Administrador();
		entrada = new Scanner(System.in);

		int opcao = -1;
		
		while (opcao != 0) {
			
			opcao = menu();
			
			switch(opcao) {
				case 1:{
					adicionarPaciente();
					break;
				}
				case 2:{
					buscarPaciente();
					break;
				}
				case 3:{
					atualizarPaciente();
					break;
				}
				case 4: {
					removerPaciente();
					break;
				}
				case 5:{
					listarPacientes();
					break;
				}
				case 0:{
					System.out.println("Finalizado");
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
		System.out.println("1- Adicionar paciente");
		System.out.println("2- Buscar paciente");
		System.out.println("3- Atualizar paciente");
		System.out.println("4- Remover paciente");
		System.out.println("5- Listar todos os pacientes");
		System.out.println("0- Sair");
		System.out.println("----------------");

		return Integer.parseInt(entrada.nextLine());
	}
	
	private static void adicionarPaciente() {
		System.out.println("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite a idade: ");
		String idade = entrada.nextLine();
		
		System.out.println("Digite o sexo: ");
		String sexo = entrada.nextLine();
		
		System.out.println("Digite o sintoma: ");
		String sintoma = entrada.nextLine();
		
		System.out.println("Possui doencas cronicas? ");
		String doencaCronica = entrada.nextLine();
		
		System.out.println("Possui alergias? ");
		String alergia = entrada.nextLine();
		
		System.out.println("Possui historico de cirurgias? ");
		String cirurgia = entrada.nextLine();
		
		Paciente contato = meusPacientes.adicionarPaciente(nome, idade, sexo, sintoma, doencaCronica, alergia, cirurgia);
		
		System.out.println("----------------");
		System.out.println(contato);
		System.out.println("----------------");
		
		System.out.println("Contato cadastrado com sucesso");
	}
	
	private static void atualizarPaciente() {
		System.out.println("Digite um nome: ");
		Paciente contato = meusPacientes.buscarPaciente(entrada.nextLine());
		if(contato == null) {
			System.out.println("Paciente nao encontrado");
		}
		else {
			System.out.println("Paciente encontrado");
			System.out.println("Digite o nome: ");
			String nome = entrada.nextLine();
			
			System.out.println("Digite a idade: ");
			String idade = entrada.nextLine();
			
			System.out.println("Digite o sexo: ");
			String sexo = entrada.nextLine();
			
			System.out.println("Digite o sintoma: ");
			String sintoma = entrada.nextLine();
			
			System.out.println("Possui doencas cronicas? ");
			String doencaCronica = entrada.nextLine();
			
			System.out.println("Possui alergias? ");
			String alergia = entrada.nextLine();
			
			System.out.println("Possui historico de cirurgias? ");
			String cirurgia = entrada.nextLine();
			
			contato = meusPacientes.atualizarPaciente(contato, nome, idade, sexo, sintoma, doencaCronica, alergia, cirurgia);
			
			System.out.println("----------------");
			System.out.println(contato);
			System.out.println("----------------");
		}
	}
	
	private static void buscarPaciente() {
		System.out.println("Digite um nome: ");
		Paciente contato = meusPacientes.buscarPaciente(entrada.nextLine());
		if(contato == null) {
			System.out.println("Paciente nao encontrado");
		}
		else {
			System.out.println("----------------");
			System.out.println(contato);
			System.out.println("----------------");
		}
	}
	
	private static void removerPaciente() {
		System.out.println("Digite um nome: ");
		boolean resultado = meusPacientes.removerPaciente(entrada.nextLine());
		if(resultado == false) {
			System.out.println("Paciente nao encontrado");
		}
		else {
			System.out.println("Paciente removido");
		}
	}
	
	private static void listarPacientes() {
		for(Paciente contato: meusPacientes.getMeusPacientes()) {
			System.out.println(contato);
		}
	}

}