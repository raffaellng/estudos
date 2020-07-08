package localhost.pontointelegente.services

import localhost.pontointelegente.documents.Funcionario

interface FuncionarioService {
    //serviço de busca

    fun persistir(funcionario: Funcionario): Funcionario?

    fun buscarCPF(cpf:String): Funcionario?

    fun buscarPorEmail(email: String):Funcionario?

    fun buscaPorId(id:String): Funcionario?
}