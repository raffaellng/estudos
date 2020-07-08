package localhost.pontointelegente.repositories

import localhost.pontointelegente.documents.Lancamento
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Page
import org.springframework.data.mongodb.repository.MongoRepository

interface LancamentoRepository : MongoRepository<Lancamento, String> {

    fun findByFuncionarioId(funcionarioId: String, pageable: Pageable): Page<Lancamento> // esta busca vai ser uma busca paginada

}