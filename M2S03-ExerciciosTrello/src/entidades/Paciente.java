package entidades;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    //Ex1: crie a Classe entidades.Paciente

    // Atributos
    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public double pressaoArterial;
    public int frequenciaCardiaca;
    public String dietaAlimentar;
    public List<String> atividadesFisicas = new ArrayList<>();

    // Ex3: criação dos métodos: Cálculo de IMC | Monitoramento de entidades.Paciente | Registro de Atividades Físicas

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
}
