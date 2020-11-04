package kotlin_basic_exercise

fun main() {
    scan(1, 10)
}

fun scan(awal: Int, akhir: Int) {
    var result :String
    for (i in awal..akhir) {


        //cara pertama
        if (i % 2 != 0) {
            if (i % 7 == 0) {
                result = "$i Ganjil kelipatan tujuh"
            } else result = "$i ganjil"

        } else {
            result = "$i Genap"
            if (i % 8 == 0) {
                result = "$i Genap kelipatan delapan"
            }
        }
        println(result)

//cara kedua
      /*  when {
            i % 100 == 0 -> println("$i kelipatan 100")
            i % 2 != 0 && i % 7 == 0 -> println("$i Ganjil kelipatan tujuh")
            i % 2 == 0 && i % 8 == 0 -> println("$i Genap kelipatan delapan")
            i % 2 != 0 -> println("$i Ganjil")
            i % 2 == 0 -> println("$i Genap")
        }*/

    }
}