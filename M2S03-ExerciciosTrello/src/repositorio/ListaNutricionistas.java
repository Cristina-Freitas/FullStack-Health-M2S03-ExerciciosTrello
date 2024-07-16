package repositorio;

import entidades.Nutricionista;

import java.util.ArrayList;
import java.util.List;


//Ex.8: Lista de Nutricionistas
public class ListaNutricionistas {

    private static List<Nutricionista> nutricionistas;

    static {
        nutricionistas = new ArrayList<>();
    }

    public static List<Nutricionista> listarNutricionistas(){
        return nutricionistas;
    }

    public static Nutricionista buscarNutricionistaId(int id){
        return nutricionistas.get(id);
    }

    public static Nutricionista buscarNutricionistaNome(String nutricionista) {
        return (Nutricionista) nutricionistas.stream()
                .filter(n -> n.getNome().equals(nutricionista))
                .findFirst()
                .orElse(null);
    }

    public static void adicionarNutricionista(Nutricionista nutricionista) {
        nutricionistas.add(nutricionista);
    }

    public static void removerNutricionista(int id){
        nutricionistas.remove(id);
    }

    public static void alterarNutricionista(Nutricionista nutricionistaAlterada, int id) {
        Nutricionista nutricionistaOriginal = nutricionistas.get(id);
        nutricionistaOriginal.setConsultas(nutricionistaAlterada.getConsultas());
        nutricionistaOriginal.setTempoExperiencia(nutricionistaAlterada.getTempoExperiencia());
        nutricionistaOriginal.setCertificacoes(nutricionistaAlterada.getCertificacoes());
        nutricionistaOriginal.setEndereco(nutricionistaAlterada.getEndereco());
        nutricionistaOriginal.setNome(nutricionistaAlterada.getNome());
        nutricionistaOriginal.setIdade(nutricionistaAlterada.getIdade());
        nutricionistaOriginal.setSalario(nutricionistaAlterada.getSalario());
    }
}

