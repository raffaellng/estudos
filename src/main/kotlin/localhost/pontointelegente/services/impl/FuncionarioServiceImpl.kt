package localhost.pontointelegente.services.impl

import localhost.pontointelegente.documents.Funcionario
import localhost.pontointelegente.repositories.FuncionarioRepository
import localhost.pontointelegente.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository) : FuncionarioService {

    override fun persistir(funcionario: Funcionario): Funcionario? = funcionarioRepository.save(funcionario)

    override fun buscarCPF(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

    override fun buscaPorId(id: String): Funcionario? = funcionarioRepository.findOne(id)
}