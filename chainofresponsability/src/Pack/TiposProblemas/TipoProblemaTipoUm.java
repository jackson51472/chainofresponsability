package Pack.TiposProblemas;

public class TipoProblemaTipoUm implements TipoProblema{

    private static TipoProblemaTipoUm tipoProblemaTipoUm = new TipoProblemaTipoUm();

    private TipoProblemaTipoUm() {};

    public static TipoProblemaTipoUm getTipoProblemaTipoUm() {
        return tipoProblemaTipoUm;
    }

}
