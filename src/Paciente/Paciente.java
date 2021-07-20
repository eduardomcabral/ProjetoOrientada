package Paciente;


public abstract class Paciente {

	protected String nome;
	protected String idade;
	protected String sexo;
	protected String doencaCronica;
	protected String alergia;
	protected String cirurgia;
	protected String sintoma;
	private int id;
	private static int ultimoId = 0;

	public Paciente(String nome) {
		this.nome = nome;
		this.id = ++ultimoId;
	}

	public abstract void sintoma();
	
	public abstract void historico();
	
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
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSintoma() {
		return sintoma;
	}
	
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
	
	public int getUltimoId() {
		return ultimoId;
	}

	public int getId() {
		return id;
	} 
	
	public void mostrarInfo(Paciente paciente) {
		System.out.println("---------------");
		System.out.println("Nome: " + paciente.getNome());
		System.out.println("Idade: " + paciente.getIdade());
		System.out.println("Sexo: " + paciente.getSexo());
		System.out.println("Id: " + paciente.getId());
		System.out.println("---------------");
	}
	
	public String toString() {
		return  "Id:" + this.id + "\n" +
				"Nome:" + this.nome + "\n" +
				"Idade:" + this.idade + "\n" +
				"Sexo:" + this.sexo + "\n"+
				"Sintoma:" + this.sintoma + "\n";
	}
}