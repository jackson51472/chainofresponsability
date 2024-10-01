package Pack.TiposProblemas;

public class TipoProblemaTipoTres implements TipoProblema{

    private static TipoProblemaTipoTres tipoProblemaTipoTres = new TipoProblemaTipoTres();

    private TipoProblemaTipoTres() {};

    public static TipoProblemaTipoTres getTipoProblemaTipoTres() {
        return tipoProblemaTipoTres;
    }

}
