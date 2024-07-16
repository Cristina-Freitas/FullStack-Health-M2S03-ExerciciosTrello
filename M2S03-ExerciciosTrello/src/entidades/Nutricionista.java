package entidades;

import java.util.List;

//Ex.4: Classe Nutricionista
public class Nutricionista extends Funcionario{

    private List<String> certificacoes;
    private int consultas;

    private int tempoExperiencia;

    public Nutricionista() {
    }

    public Nutricionista(String nome, int idade, Endereco endereco, double salario, List<String> certificacoes, int consultas, int tempoExperiencia) {
        super(nome, idade, endereco, salario);
        this.certificacoes = certificacoes;
        this.consultas = consultas;
        this.tempoExperiencia = tempoExperiencia;
    }

    //Ex.5: Métodos
    public void adicionarTempoExperiencia(){
        this.tempoExperiencia += 1;
    }

    public void adicionarCertificacao(String certificacao){
        this.certificacoes.add(certificacao);
    }

    public List<String> getCertificacoes() {
        return certificacoes;
    }

    public void setCertificacoes(List<String> certificacoes) {
        this.certificacoes = certificacoes;
    }

    public int getConsultas() {
        return consultas;
    }

    public void setConsultas(int consultas) {
        this.consultas = consultas;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }
}
