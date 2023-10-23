public class atividadeComplementar {
    String nomeAluno;
    int matriculacom;
    int numeroRegistro;
    int grupoAtividade;
    String descricaoAtividade;
    Boolean statusAproveitamento;
    int cargaHorariaConsiderada;
    public atividadeComplementar(){};
    public atividadeComplementar(String nomeAluno, int matriculacom, int numeroRegistro, int grupoAtividade,
            String descricaoAtividade, Boolean statusAproveitamento, int cargaHorariaConsiderada) {
        this.nomeAluno = nomeAluno;
        this.matriculacom = matriculacom;
        this.numeroRegistro = numeroRegistro;
        this.grupoAtividade = grupoAtividade;
        this.descricaoAtividade = descricaoAtividade;
        this.statusAproveitamento = statusAproveitamento;
        this.cargaHorariaConsiderada = cargaHorariaConsiderada;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public int getmatriculacom() {
        return matriculacom;
    }
    public void setmatriculacom(int matriculacom) {
        this.matriculacom = matriculacom;
    }
    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    public int getGrupoAtividade() {
        return grupoAtividade;
    }
    public void setGrupoAtividade(int grupoAtividade) {
        this.grupoAtividade = grupoAtividade;
    }
    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }
    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }
    public Boolean getStatusAproveitamento() {
        return statusAproveitamento;
    }
    public void setStatusAproveitamento(Boolean statusAproveitamento) {
        this.statusAproveitamento = statusAproveitamento;
    }
    public int getCargaHorariaConsiderada() {
        return cargaHorariaConsiderada;
    }
    public void setCargaHorariaConsiderada(int cargaHorariaConsiderada) {
        this.cargaHorariaConsiderada = cargaHorariaConsiderada;
    }
    

    
}
