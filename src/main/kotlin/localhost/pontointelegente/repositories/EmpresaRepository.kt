package localhost.pontointelegente.repositories

import localhost.pontointelegente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {
    fun findByCnpj(cnpj: String):Empresa? //Find = busca, by = qual(Empresa) , cnpj = campo
}