public class TelefonePessoa {
    private String numeroTelefone;
    private TipoFone tipoFone;

    public TelefonePessoa(String numeroTelefone, TipoFone tipoFone) {
        this.numeroTelefone = numeroTelefone;
        this.tipoFone = tipoFone;
    }

    public String getNumero() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public TipoFone getTipoFone() {
        return tipoFone;
    }

    public void setTipoFone(TipoFone tipoFone) {
        this.tipoFone = tipoFone;
    }

    public void adicionarTelefone(String numeroTelefone, TipoFone tipoFone) {
        setNumeroTelefone(numeroTelefone);
        setTipoFone(tipoFone);
        System.out.println("\nTelefone adicionado: " + this);
    }

    public void removerTelefone() {
        this.numeroTelefone = null;
        this.tipoFone = null;
        System.out.println("Telefone removido.");
    }

    public void alterarTelefone(String novoNumero, TipoFone novoTipoFone) {
        this.numeroTelefone = novoNumero;
        this.tipoFone = novoTipoFone;
        System.out.println("Telefone alterado para: " + this);
    }

@Override
    public String toString() {
        if (numeroTelefone == null || tipoFone == null) {
            return "Telefone não cadastrado.";
        }
        return tipoFone.getDescricao() + ": " + numeroTelefone;
    }
}