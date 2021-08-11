package Principal;

import Paciente.Comum;
import Paciente.Paciente;
import Paciente.GrupoAtencao;
import Paciente.SintomaCovid;
import Medico.Medico;
import java.util.Scanner;
import Medico.ClinicoGeral;
import Medico.Pediatra;
import Medico.Geriatra;
import Medico.Infectologista;


public class Principal {
	private static ControlePacientes meusPacientes;
	private static Scanner entrada;

	public static void main(String[] args) {
		
		meusPacientes = new ControlePacientes();
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
				
				case 3: {
					removerPaciente();
					break;
				}
				case 0:{
					System.out.println("Consulta finalizada");
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
		System.out.println("3- Remover paciente");
		System.out.println("0- Sair");
		System.out.println("----------------");

		return Integer.parseInt(entrada.nextLine());
	}

	
	
	
	private static void adicionarPaciente() {
		System.out.println("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite a idade: ");
		int idade = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o sexo: ");
		String sexo = entrada.nextLine();
		
		System.out.println("Digite o sintoma: ");
		String sintoma = entrada.nextLine();
		
		System.out.println("Caso tenha alguma condição adicional que seja de grupo de risco, adicionar:  ");
		String adicional = entrada.nextLine();
		
		Paciente paciente = meusPacientes.adicionarPaciente(nome, idade, sexo, sintoma, adicional);
		
		paciente.tipoPaciente();
		
		System.out.println("----------------");
		System.out.println(paciente);
		System.out.println("----------------");
		
		System.out.println("Paciente cadastrado com sucesso");
	}
		
	private static void buscarPaciente() {
		System.out.println("Digite um nome: ");
		Paciente paciente = meusPacientes.buscarPaciente(entrada.nextLine());
		if(paciente == null) {
			System.out.println("Paciente nao encontrado");
		}
		else {
			System.out.println("----------------");
			System.out.println(paciente);
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

} 