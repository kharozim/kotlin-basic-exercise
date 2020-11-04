package kotlin_basic_exercise

import java.util.*

fun main() {
//    var nilai = 5
//    when {
//        (nilai % 2 != 0) && (nilai % 5 == 0) -> println("Imperio Aberto")
//        (nilai % 2 == 0) && (nilai % 4 == 0) -> println("Curcio Reducto")
//        nilai % 2 == 0 -> println("Curcio")
//        nilai % 2 != 0 -> println("Imperio")
//        else -> println("Unknown")
//    }

    for (nilai in 1..20) {
        if (nilai % 2 == 0) {
            if (nilai % 4 == 0) {
                println("$nilai Curcio Reducto")
            } else println("$nilai Curcio")
        } else {
            if (nilai % 5 == 0) {
                println("$nilai Imperio Aberto")
            } else println("$nilai Imperio")
        }
    }
}

