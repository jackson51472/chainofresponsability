package Pack.TiposProblemas;

public class TipoProblemaTipoDois implements TipoProblema {

    private static TipoProblemaTipoDois tipoProblemaTipoDois = new TipoProblemaTipoDois();

    private TipoProblemaTipoDois() {};

    public static TipoProblemaTipoDois getTipoProblemaTipoDois() {
        return tipoProblemaTipoDois;
    }

}
