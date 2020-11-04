package kotlin_basic_exercise

fun main() {
    val hitungKabisat = kabisat(1, 20)
}

fun kabisat(start: Int, end: Int) {
    for (i in start..end) {
        if (i % 4 == 0) println("$i ADALAH tahun kabisat")
        else println("$i bukan tahun kabisat")
    }
}