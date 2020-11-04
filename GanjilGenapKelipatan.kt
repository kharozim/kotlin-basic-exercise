package kotlin_basic_exercise

fun main() {
    scan(1, 1000)
}

fun scan(awal: Int, akhir: Int) {
    for (i in awal..akhir) {

        when {
            i % 100 == 0 -> println("$i kelipatan 100")
            i % 2 != 0 && i % 7 == 0 -> println("$i Ganjil kelipatan tujuh")
            i % 2 == 0 && i % 8 == 0 -> println("$i Genap kelipatan delapan")
            i % 2 != 0 -> println("$i Ganjil")
            i % 2 == 0 -> println("$i Genap")
        }

    }
}