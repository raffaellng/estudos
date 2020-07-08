package utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtils {
    fun gerarBCrpy(senha: String): String = BCryptPasswordEncoder().encode(senha)
}

