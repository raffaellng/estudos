package localhost.pontointelegente.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Empresa(
        val razaoSocial: String,
        var cnpj: String,
        @Id val id: String? = null
)

