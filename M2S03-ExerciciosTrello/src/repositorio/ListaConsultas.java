package repositorio;

import entidades.Consulta;
import entidades.Nutricionista;

import java.util.ArrayList;
import java.util.List;


//Ex.7: Lista de Consultas
public class ListaConsultas {

    private static List<Consulta> consultas;

    static {
        consultas = new ArrayList<>();
    }

    public static List<Consulta> listarConsultas(){
        return consultas;
    }

    public static Consulta buscarConsultaId(int id){
        return consultas.get(id);
    }

    public static void adicionarConsulta(Consulta consulta){

        Nutricionista nutricionista = ListaNutricionistas.buscarNutricionistaNome(consulta.getNutricionista());
        if (nutricionista != null) {
            int numeroConsultas = nutricionista.getConsultas() + 1;
            nutricionista.setConsultas(numeroConsultas);
        }
        consultas.add(consulta);
    }

    public static void removerConsulta(int id){
        consultas.remove(id);
    }

    public static void alterarConsulta(Consulta consultaAlterada, int id) {
        Consulta consultaOriginal = consultas.get(id);
        consultaOriginal.setNutricionista(consultaAlterada.getNutricionista());
        consultaOriginal.setPaciente(consultaAlterada.getPaciente());
        consultaOriginal.setDataHora(consultaAlterada.getDataHora());
        consultaOriginal.setRealizada(consultaAlterada.isRealizada());
    }

}

