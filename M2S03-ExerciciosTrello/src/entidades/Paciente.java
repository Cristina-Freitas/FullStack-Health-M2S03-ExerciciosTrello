package entidades;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    // Atributos
    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public double pressaoArterial;
    public int frequenciaCardiaca;
    public String dietaAlimentar;
    public List<String> atividadesFisicas = new ArrayList<>();

    //Ex 1:  Construtores e getters/setters
    // Construtor vazio
    public Paciente(){
        this.atividadesFisicas = new ArrayList<>();
    };

    // Construtor com todos os atributos
    public Paciente(String nome, int idade, double peso, double altura, double pressaoArterial, int frequenciaCardiaca, String dietaAlimentar) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.pressaoArterial = pressaoArterial;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.dietaAlimentar = dietaAlimentar;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public void monitoramento() {
        System.out.println("Informações do paciente:\n" +
                "Nome: " + this.nome + "\n" +
                "Idade: " + this.idade + "\n" +
                "Peso: " + this.peso + "kg" + "\n" +
                "Altura: " + this.altura + "cm" + "\n" +
                "Pressão arterial: " + this.pressaoArterial + " mmHg." + "\n" +
                "Frequência cardíaca: " + this.frequenciaCardiaca + " bpm." + "\n" +
                "Dieta alimentar: " + this.dietaAlimentar + "\n" +
                "Atividades físicas: " + this.atividadesFisicas + "\n" +
                "IMC: " + this.calcularIMC());
    }

    public void registrarAtividadeFisica(String novaAtividade) {

               this.atividadesFisicas.add(novaAtividade);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(int frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    public void setDietaAlimentar(String dietaAlimentar) {
        this.dietaAlimentar = dietaAlimentar;
    }

    public List<String> getAtividadesFisicas() {
        return atividadesFisicas;
    }

    public void setAtividadesFisicas(List<String> atividadesFisicas) {
        this.atividadesFisicas = atividadesFisicas;
    }
}
