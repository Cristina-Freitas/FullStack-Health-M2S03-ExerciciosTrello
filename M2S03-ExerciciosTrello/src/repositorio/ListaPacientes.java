package repositorio;

import entidades.Paciente;

import java.util.ArrayList;
import java.util.List;

public class ListaPacientes {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static List<Paciente> listarPacientes(){
        System.out.println("Id - Nome");
        for (Paciente item : pacientes){
            System.out.println(pacientes.indexOf(item) + " - " + item.nome + ";");
        }
        return null;
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

