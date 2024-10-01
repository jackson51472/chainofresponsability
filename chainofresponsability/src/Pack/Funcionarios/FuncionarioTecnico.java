package Pack.Funcionarios;

import Pack.TiposProblemas.TipoProblemaTipoTres;

public class FuncionarioTecnico extends Funcionario{

    public FuncionarioTecnico(Funcionario superior) {
        listProblemas.add(TipoProblemaTipoTres.getTipoProblemaTipoTres());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Problema Tipo 3";
    }
}
