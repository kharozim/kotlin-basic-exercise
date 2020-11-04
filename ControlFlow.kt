package kotlin_basic_exercise

import java.util.*

fun main() {
    val nilai = 8
    when {
        (nilai % 2 != 0) && (nilai % 5 == 0) -> println("Imperio Aberto")
        (nilai % 2 == 0) && (nilai % 4 == 0) -> println("Curcio Reducto")
        nilai % 2 == 0 -> println("Curcio")
        nilai % 2 != 0 -> println("Imperio")
        else -> println("Unknown")
    }
}

