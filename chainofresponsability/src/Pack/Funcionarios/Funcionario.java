package Pack.Funcionarios;

import Pack.Aparelho;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listProblemas = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String resolverProblema(Aparelho aparelho) {
        if (listProblemas.contains(aparelho.getTipoProblema())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.resolverProblema(aparelho);
            }
            else
            {
                return "Sem problemas";
            }
        }
    }

}
