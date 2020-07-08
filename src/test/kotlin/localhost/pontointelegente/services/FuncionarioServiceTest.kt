package localhost.pontointelegente.services

import localhost.pontointelegente.documents.Funcionario
import localhost.pontointelegente.enums.PerfilEnum
import localhost.pontointelegente.repositories.FuncionarioRepository
import org.junit.Assert
import org.junit.Before
//import org.junit.Test
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import utils.SenhaUtils
import java.lang.Exception

@RunWith(SpringRunner::class)
@SpringBootTest
class FuncionarioServiceTest {

    @MockBean
    private val funcionarioRepository: FuncionarioRepository? = null

    @Autowired
    private val funcionarioService: FuncionarioService? = null

    private val email: String = "Emailteste@teste.com"
    private val cpf: String = "122.256.155.29"
    private val id: String = "1"

    @Before
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(funcionarioRepository?.save(Mockito.any(Funcionario::class.java))).willReturn(funcionario())
        BDDMockito.given(funcionarioRepository?.findOne(cpf)).willReturn(funcionario())
        BDDMockito.given(funcionarioRepository?.findByEmail(email)).willReturn(funcionario())
        BDDMockito.given(funcionarioRepository?.findByCpf(cpf)).willReturn(funcionario())
    }

    @Test
    fun testPersistirFuncionario() {
        val funcionario: Funcionario? = this.funcionarioService?.persistir(funcionario())
        Assert.assertNotNull(funcionario)
    }

    @Test
    fun testBuscaFuncionarioPorId() {
        val funcionario: Funcionario? = this.funcionarioService?.buscaPorId(id)
        Assert.assertNotNull(funcionario)
    }

    @Test
    fun testBuscaFuncionarioPorEmail() {
        val funcionario: Funcionario? = this.funcionarioService?.buscarPorEmail(email)
        Assert.assertNotNull(funcionario)
    }

    @Test
    fun testBuscaFuncionarioPorCPF() {
        val funcionario: Funcionario? = this.funcionarioService?.buscarCPF(cpf)
        Assert.assertNotNull(funcionario)
    }

    private fun funcionario(): Funcionario = Funcionario("Raffaell", email, SenhaUtils().gerarBCrpy("123456"),
            cpf, PerfilEnum.ROLE_USUARIO, id)
}