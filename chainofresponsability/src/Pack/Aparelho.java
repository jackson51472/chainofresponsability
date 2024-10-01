package Pack;

import Pack.TiposProblemas.TipoProblema;

public class Aparelho {
    private TipoProblema tipoProblema;

    public Aparelho(TipoProblema tipoDocumento) {
        this.tipoProblema = tipoDocumento;
    }

    public TipoProblema getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
}
