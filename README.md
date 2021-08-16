# ProjetoPOO

A aplicação deve coletar informações dos Pacientes (nome, idade, sexo, sintoma e adicional) e classifica-los através de um score.
O sistema de scores varia de 0 a 10 e tem como intenção priorizar pacientes com maior risco. Para utilização da interface SolicitarEmergencia, somente pacientes de médicos Geriatricos e Infectologistas podem utilizar tal função.

O encaminhamento de pacientes é feito através da fórmula encaminhar, os critérios variam de acordo com idade e sintomas. Feito o encaminhamento o Paciente deve ser encaminhado ao médico mais adequado, as classes são as seguintes:
- Clínico Geral: atendimento de adultos
- Pediatra: atendimento de jovens
- Geriatra: atendimento de idosos
- Infectologista: atendimento de pacientes com sintomas de covid-19

O método Principal foi desenvolvido de forma a coletar de maneira rápida, direta e completa as informações pertinentes de cada paciente.
Foi também desenvolvido uma Exceção para a utilização do SolicitarEmergencia para mensagem de erro do tipo RunTimeException caso o score seja menor que 7, considerando que o paciente não se adequa a grupos prioritarios.
Por fim, foram realizados testes automatizados a fim de identificar erros na programação.
