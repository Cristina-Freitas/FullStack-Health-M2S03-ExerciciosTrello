package repositorio;

import entidades.Paciente;

import java.util.ArrayList;

public class ListaPacientes {

    //Ex2: lista de dados
    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void listarPacientes(){
        System.out.println("Id - Nome");
        for (Paciente item : pacientes){
            System.out.println(pacientes.indexOf(item) + " - " + item.nome + ";");
        }
    }

    public static Paciente buscarPacienteId(int id){
        return pacientes.get(id);
    }

    public static void adicionarPaciente(Paciente paciente) {

        pacientes.add(paciente);
    }

    public static void removerPaciente(int id){


        pacientes.remove(id);
    }
}

