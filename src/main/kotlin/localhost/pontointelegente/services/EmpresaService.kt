package localhost.pontointelegente.services

import localhost.pontointelegente.documents.Empresa

interface EmpresaService {
    fun buscarPorCnpj(cnpj:String):Empresa?

    fun persistir(empresa:Empresa):Empresa
}