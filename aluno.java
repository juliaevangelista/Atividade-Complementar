public class aluno{
    String nomeCompleto;
    int matricula;
    String curso;
    int cargaHorariaTotal;
    int quantidadeAtividades;

    public aluno(String nomeCompleto, int matricula, String curso, int cargaHorariaTotal, int quantidadeAtividades) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.curso = curso;
        this.cargaHorariaTotal = cargaHorariaTotal;
        this.quantidadeAtividades = quantidadeAtividades;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }
    public void setCargaHorariaTotal(int cargaHorariaTotal) {
        this.cargaHorariaTotal = cargaHorariaTotal;
    }
    public int getQuantidadeAtividades() {
        return quantidadeAtividades;
    }
    public void setQuantidadeAtividades(int quantidadeAtividades) {
        this.quantidadeAtividades = quantidadeAtividades;
    }
        
}
