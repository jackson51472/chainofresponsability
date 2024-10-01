package Test;

import Pack.Aparelho;
import Pack.Funcionarios.FuncionarioAtendente;
import Pack.Funcionarios.FuncionarioEstagiario;
import Pack.Funcionarios.FuncionarioTecnico;
import Pack.TiposProblemas.TipoProblemaTipoDois;
import Pack.TiposProblemas.TipoProblemaTipoTres;
import Pack.TiposProblemas.TipoProblemaTipoUm;
import Pack.TiposProblemas.TipoProblemaZero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AparelhoTest {

    FuncionarioAtendente atendente;
    FuncionarioEstagiario estagiario;
    FuncionarioTecnico tecnico;

    @BeforeEach
    void setUp() {
        atendente = new FuncionarioAtendente(null);
        estagiario = new FuncionarioEstagiario(atendente);
        tecnico = new FuncionarioTecnico(estagiario);
    }

    @Test
    void deveRetornarAtendenteProblemaTipoUm() {
        assertEquals("Problema Tipo 1", atendente.resolverProblema(new Aparelho(TipoProblemaTipoUm.getTipoProblemaTipoUm())));
    }

    @Test
    void deveRetornarEstagiarioProblemaTipoDois() {
        assertEquals("Problema Tipo 2", estagiario.resolverProblema(new Aparelho(TipoProblemaTipoDois.getTipoProblemaTipoDois())));
    }

    @Test
    void deveRetornarTecnicoProblemaTipoTres() {
        assertEquals("Problema Tipo 3", tecnico.resolverProblema(new Aparelho(TipoProblemaTipoTres.getTipoProblemaTipoTres())));
    }

    @Test
    void deveRetornarTecnicoProblemaTipoZero() {
        assertEquals("Sem problemas", tecnico.resolverProblema(new Aparelho(TipoProblemaZero.getTipoProblemaZero())));
    }

}