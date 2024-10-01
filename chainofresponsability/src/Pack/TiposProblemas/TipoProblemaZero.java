package Pack.TiposProblemas;

public class TipoProblemaZero implements TipoProblema{

    private static TipoProblemaZero tipoProblemaZero = new TipoProblemaZero();

    private TipoProblemaZero() {};

    public static TipoProblemaZero getTipoProblemaZero() {
        return tipoProblemaZero;
    }

}
