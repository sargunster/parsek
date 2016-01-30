package me.sargunvohra.lib.cakeparse.exception

import me.sargunvohra.lib.cakeparse.lexer.Token
import me.sargunvohra.lib.cakeparse.lexer.TokenInstance

class UnexpectedTokenException(
        val expected: Token?,
        val got: TokenInstance
) : ParseException(
        "Expected ${expected?.let { "'${expected.name}' token" } ?: "end of file"},"
                + " but got '${got.type.name}' at row ${got.row}, column ${got.col}"
)