package Pack.Funcionarios;

import Pack.TiposProblemas.TipoProblemaTipoUm;

public class FuncionarioAtendente extends Funcionario{


    public FuncionarioAtendente(Funcionario superior) {
        listProblemas.add(TipoProblemaTipoUm.getTipoProblemaTipoUm());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Problema Tipo 1";
    }
}
