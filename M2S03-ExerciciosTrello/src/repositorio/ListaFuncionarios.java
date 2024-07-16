package repositorio;

import entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;

//Ex.8: Lista de Funcionários
public class ListaFuncionarios {
    private static List<Funcionario> funcionarios;

    static {
        funcionarios = new ArrayList<>();
    }

    public static List<Funcionario> listar(){
        return funcionarios;
    }

    public static Funcionario buscarId(int id){
        return funcionarios.get(id);
    }

    public static void adicionar(Funcionario Funcionario) {
        funcionarios.add(Funcionario);
    }

    public static void remover(int id){
        funcionarios.remove(id);
    }

    public static void alterar(Funcionario funcionarioAlterado, int id) {
        Funcionario funcionarioOriginal = funcionarios.get(id);
        funcionarioOriginal.setEndereco(funcionarioAlterado.getEndereco());
        funcionarioOriginal.setNome(funcionarioAlterado.getNome());
        funcionarioOriginal.setIdade(funcionarioAlterado.getIdade());
        funcionarioOriginal.setSalario(funcionarioAlterado.getSalario());
    }


}
