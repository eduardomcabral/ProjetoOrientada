package Interface;
import Paciente.Paciente;
import Medico.Medico;

public interface AtualizarInfo{
	
	public Paciente atualizarInfo(Paciente paciente, String nome, int idade, String sexo, String sintoma) {
		pessoa.setNome(nome);
		pessoa = this.setPessoa(paciente, idade, sexo, sintoma);
		return pessoa;
	}
	
}