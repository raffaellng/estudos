package localhost.pontointelegente.services

import localhost.pontointelegente.documents.Empresa
import localhost.pontointelegente.repositories.EmpresaRepository
import org.junit.Assert
import org.junit.Before
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.lang.Exception

@RunWith(SpringRunner::class)
@SpringBootTest
class EmpresaServiceTest {

    @Autowired
    val empresaService: EmpresaService? = null

    @MockBean
    private val empresaRepository: EmpresaRepository? = null

    private val CNPJ = "1233321231000111"

    @Before
    @Throws(Exception::class)
    fun setUp(){
        BDDMockito.given(empresaRepository?.findByCnpj(CNPJ)).willReturn(empresa())
        BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
    }

    @Test
    fun tesBuscaEmpresaPorCNPJ(){
        val empresa: Empresa? = this.empresaService?.buscarPorCnpj(CNPJ)
        Assert.assertNotNull(empresa)
    }

    @Test
    fun testPersistirEmpresa(){
        val empresa: Empresa? = this.empresaService?.persistir(empresa())
        Assert.assertNotNull(empresa)
    }

    private fun empresa(): Empresa = Empresa("razão social",CNPJ,"1")
}