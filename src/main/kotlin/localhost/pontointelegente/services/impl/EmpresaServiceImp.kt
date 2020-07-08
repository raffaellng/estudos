package localhost.pontointelegente.services.impl

import localhost.pontointelegente.documents.Empresa
import localhost.pontointelegente.repositories.EmpresaRepository
import localhost.pontointelegente.services.EmpresaService
import org.springframework.stereotype.Service

@Service //Inidicando que a clase e um serviço, e que vai receber injeção de dependencias
class EmpresaServiceImp(val empresaRepository: EmpresaRepository) : EmpresaService{

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}