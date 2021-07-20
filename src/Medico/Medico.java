package Medico;
public abstract class Medico {

	protected String nome;
	protected String especialidade;
	private int id;
	private static int ultimoId = 0;

	public Medico(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.id = ++ultimoId;
	}

	//public abstract String atacando();
	
	//public void atualizar(Paciente paciente) {
		//vida -= 50;
		//if (vida <= 0) {
			//vida = 0;
			//System.out.println(inimigo.getNome() + " morreu");
		//}
		//System.out.println("Testando");
	//}
	public String getNome() {
		return nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	
	public int getUltimoId() {
		return ultimoId;
	}

	public int getId() {
		return id;
	} 
	
	public void mostrarInfo(Medico medico) {
		System.out.println("---------------");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Especialidade: " + medico.getEspecialidade());
		System.out.println("---------------");
	}
}