public enum TipoFone {
    CELULAR("Celular"),
    FIXO("Fixo"),
    COMERCIAL("Comercial"),
    RESIDENCIAL("Residencial"),
    OUTRO("Outro");

    private final String descricao;

    TipoFone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
