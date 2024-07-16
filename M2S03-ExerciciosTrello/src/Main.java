import entidades.*;
import repositorio.ListaConsultas;
import repositorio.ListaFuncionarios;
import repositorio.ListaNutricionistas;
import repositorio.ListaPacientes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Ex9: Telas Novas
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println();
        while (true) {
            System.out.println("""
                    Escolha uma opção:
                    1 - Cadastrar paciente
                    2 - Listar pacientes
                    3 - Alterar informações do paciente
                    4 - Mostrar informações do paciente
                    5 - Registrar atividade física para um paciente
                    6 - Remover paciente
                    7 - Cadastrar Funcionário
                    8 - Listar Funcionários
                    9 - Cadastrar Nutricionista
                    10 - Cadastrar Consulta
                    11 - Listar Consultas
                    12 - Realizar Consulta
                    13 - Sair""");
           
            opcao = Integer.parseInt(scanner.next());

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("Cadastrar paciente");
                    telaCadastrarPaciente(scanner);
                    continue;
                case 2:
                    System.out.println();
                    System.out.println("Lista de pacientes");
                    telaListarPacientes();
                    continue;
                case 3:
                    System.out.println();
                    System.out.println("Alterar informações do paciente");
                    telaAlterarPaciente(scanner);
                    continue;
                case 4:
                    System.out.println();
                    System.out.println("Mostrar informações do paciente");
                    telaExibirPaciente(scanner);
                    continue;
                case 5:
                    System.out.println();
                    System.out.println("Registrar atividade física para um paciente");
                    telaRegistrarAtividade(scanner);
                    continue;
                case 6:
                    System.out.println();
                    System.out.println("Remover paciente");
                    telaRemoverPaciente(scanner);
                    continue;
                case 7:
                    System.out.println();
                    System.out.println("Cadastrar Funcionário");
                    continue;
                case 8:
                    System.out.println();
                    System.out.println("Listar Funcionários");
                    continue;
                case 9:
                    System.out.println();
                    System.out.println("Cadastrar Nutricionista");
                    continue;
                case 10:
                    System.out.println();
                    System.out.println("Cadastrar Consulta");
                    continue;
                case 11:
                    System.out.println();
                    System.out.println("Listar Consultas");
                    continue;
                case 12:
                    System.out.println();
                    System.out.println("Realizar Consulta");
                    continue;
                case 13:
                    System.out.println("Saindo..");
                    break;
                default:
                    continue;
            }
            break; // break referente ao while;
        }
        scanner.close();
    }

    private static void telaCadastrarPaciente(Scanner scanner) {
        Paciente paciente = new Paciente();
        System.out.println("Insira os dados do paciente:");

        System.out.print("Nome: ");
        paciente.setNome(scanner.next());

        System.out.print("Idade: ");
        paciente.setIdade(Integer.parseInt(scanner.next()));

        System.out.print("Peso: ");
        paciente.setPeso(Double.parseDouble(scanner.next()));

        System.out.print("Altura: ");
        paciente.setAltura(Double.parseDouble(scanner.next()));

        System.out.print("Pressão Arterial: ");
        paciente.setPressaoArterial(Double.parseDouble(scanner.next()));

        System.out.print("Frequência cardíaca: ");
        paciente.setFrequenciaCardiaca(Integer.parseInt(scanner.next()));

        System.out.print("Tipo de dieta alimentar: ");
        paciente.setDietaAlimentar(scanner.next());
        ListaPacientes.adicionarPaciente(paciente);
    }

    private static void telaListarPacientes() {
        ListaPacientes.listarPacientes();
    }


    private static void telaAlterarPaciente(Scanner scanner) {
        System.out.println("Insira o id do paciente que deseja alterar?");

        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));

        System.out.println("Atualize as informações:");
        System.out.print("Peso: ");
        paciente.setPeso(Double.parseDouble(scanner.next()));

        System.out.print("Altura: ");
        paciente.setAltura(Double.parseDouble(scanner.next()));

        System.out.print("Pressão arterial: ");
        paciente.setPressaoArterial(Double.parseDouble(scanner.next()));

        System.out.print("Frequência cardíaca: ");
        paciente.setFrequenciaCardiaca(Integer.parseInt(scanner.next()));

        System.out.print("Dieta alimentar: ");
        paciente.setDietaAlimentar(scanner.next());

        System.out.println("Informações atualizadas.");
        paciente.monitoramento();
    }

    private static void telaExibirPaciente(Scanner scanner) {
        System.out.println("Insira o id do paciente para exibir as informações?");

        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));
        paciente.monitoramento();
    }

    private static void telaRegistrarAtividade(Scanner scanner) {
        System.out.println("Insira o id do paciente para registrar a atividade física?");

        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));

        System.out.print("Atividade física: ");
        paciente.registrarAtividadeFisica(scanner.next());

        System.out.println("Atividade física registrada.");
        
    }

    private static void telaRemoverPaciente(Scanner scanner) {
        System.out.println("Insira o id do paciente que deseja remover?");

        ListaPacientes.removerPaciente(Integer.parseInt(scanner.next()));
        System.out.println("entidades.Paciente removido com sucesso!");
        
    }

    private static void telaCadastrarFuncionario(Scanner scanner) {
        Funcionario funcionario = new Funcionario();
        System.out.println("Insira os dados do funcionário:");

        System.out.print("Nome: ");
        funcionario.setNome(scanner.next());

        System.out.print("Idade: ");
        funcionario.setIdade(Integer.parseInt(scanner.next()));

        System.out.print("Salário: ");
        funcionario.setSalario(Double.parseDouble(scanner.next()));

        Endereco endereco = new Endereco();

        System.out.print("Logradouro: ");
        endereco.setLogradouro(scanner.next());

        System.out.print("Número: ");
        endereco.setNumero(scanner.nextInt());

        System.out.print("Cidade: ");
        endereco.setCidade(scanner.next());

        System.out.print("Estado: ");
        endereco.setEstado(scanner.next());

        System.out.print("CEP: ");
        endereco.setCep(Integer.valueOf(scanner.next()));

        funcionario.setEndereco(endereco);

        ListaFuncionarios.adicionar(funcionario);

        System.out.println("Funcionário cadastrado com sucesso!");

    }

    private static void telaListarFuncionarios() {
        System.out.println("Lista de funcionários Id - Nome");
        List<Funcionario> funcionarios = ListaFuncionarios.listar();
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionarios.indexOf(funcionario) + " - " + funcionario.getNome());
        }
    }

    private static void telaCadastrarNutricionista(Scanner scanner) {
        Nutricionista nutricionista = new Nutricionista();
        System.out.println("Insira os dados do nutricionista:");

        System.out.print("Nome: ");
        String nomeNutricionista = scanner.nextLine();
        Nutricionista nutricionistaExiste = ListaNutricionistas.buscarNutricionistaNome(nomeNutricionista);
        if (nutricionistaExiste != null) {
            System.out.println("Já existe uma nutricionista com este nome no cadastro.");
            return;
        }

        nutricionista.setNome(nomeNutricionista);

        System.out.print("Idade: ");
        nutricionista.setIdade(Integer.parseInt(scanner.next()));

        Endereco endereco = new Endereco();

        System.out.print("Logradouro: ");
        endereco.setLogradouro(scanner.next());

        System.out.print("Número: ");
        endereco.setNumero(scanner.nextInt());

        System.out.print("Cidade: ");
        endereco.setCidade(scanner.next());

        System.out.print("Estado: ");
        endereco.setEstado(scanner.next());

        System.out.print("CEP: ");
        endereco.setCep(Integer.valueOf(scanner.next()));

        nutricionista.setEndereco(endereco);


        System.out.print("Salário: ");
        nutricionista.setSalario(Double.parseDouble(scanner.next()));

        System.out.print("Tempo de experiência: ");
        nutricionista.setTempoExperiencia(Integer.parseInt(scanner.next()));
        nutricionista.setConsultas(0);

        System.out.print("Certificações: ");
        nutricionista.setCertificacoes(List.of(scanner.next()));

        ListaFuncionarios.adicionar(nutricionista);
        ListaNutricionistas.adicionarNutricionista(nutricionista);

        System.out.println("Nutricionista cadastrado com sucesso!");

    }

    private static void telaCadastrarConsulta(Scanner scanner) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Insira os dados da consulta:");
        Consulta consulta = new Consulta();

        System.out.print("Nome da Nutricionista: ");
        consulta.setNutricionista(scanner.next());
        Nutricionista nutricionistaExiste = ListaNutricionistas.buscarNutricionistaNome(consulta.getNutricionista());
        if (nutricionistaExiste == null) {
            System.out.println("Nutricionista não encontrado.");
            return;
        }

        consulta.setNutricionista(nutricionistaExiste.getNome());

        System.out.print("Nome do Paciente: ");
        consulta.setPaciente(scanner.next());
        List<Paciente> pacientes = ListaPacientes.listarPacientes();
        Paciente pacienteExiste = pacientes.stream().
                                            filter(paciente -> paciente.getNome().
                                                    equals(consulta.getPaciente())).
                                                    findFirst().
                                                    orElse(null);
        if (pacienteExiste == null) {
            System.out.println("Paciente não encontrado.");
            return;
        }
        consulta.setPaciente(pacienteExiste.getNome());

        System.out.print("Data e hora da consulta (dd/MM/yyyy HH:mm): ");
        consulta.setDataHora(LocalDateTime.parse(scanner.next(), formatter));

        consulta.setRealizada(false);

        ListaConsultas.adicionarConsulta(consulta);
        System.out.println("Consulta cadastrada com sucesso!");
    }

    private static void telaListarConsultas() {
        System.out.println("Listar Consultas");
        List<Consulta> consultas = ListaConsultas.listarConsultas();
        for (Consulta consulta : consultas) {
            System.out.println("Nutricionista: " + consulta.getNutricionista());
            System.out.println("Paciente: " + consulta.getPaciente());
            System.out.println("Data e hora: " + consulta.getDataHora());
            System.out.println("Realizada: " + (consulta.isRealizada() ? "Sim" : "Não"));
            System.out.println();
        }

    }

    private static void telaRealizarConsulta() {
        System.out.println("Realizar Consulta");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o id da consulta que deseja realizar:");
        int id = Integer.parseInt(scanner.next());
        Consulta consulta = ListaConsultas.buscarConsultaId(id);
        consulta.setRealizada(true);
        System.out.println("Consulta realizada com sucesso!");
    }

}
