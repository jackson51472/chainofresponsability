package Pack.Funcionarios;

import Pack.TiposProblemas.TipoProblemaTipoDois;
import Pack.TiposProblemas.TipoProblemaTipoUm;

public class FuncionarioEstagiario extends Funcionario{

    public FuncionarioEstagiario(Funcionario superior) {
        listProblemas.add(TipoProblemaTipoDois.getTipoProblemaTipoDois());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Problema Tipo 2";
    }
}
