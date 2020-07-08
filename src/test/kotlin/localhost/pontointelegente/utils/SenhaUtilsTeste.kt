package localhost.pontointelegente.utils

import org.junit.Assert
import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import utils.SenhaUtils

class SenhaUtilsTeste {
    private val SENHA = "123456"
    private val bCrytEncoder = BCryptPasswordEncoder()

    @Test
    fun testGerarHashSenha(){
        val hash = SenhaUtils().gerarBCrpy(SENHA)
        Assert.assertTrue(bCrytEncoder.matches(SENHA,hash))
    }
}