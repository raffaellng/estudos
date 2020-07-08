package localhost.pontointelegente.repositories

import localhost.pontointelegente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {
    fun findByEmail(email: String ): Funcionario?
    fun findByCpf(cpf:String): Funcionario?
    fun findOne(id:String ) : Funcionario?
}