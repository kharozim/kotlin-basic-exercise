package kotlin_basic_exercise

fun main() {
    val x = 64
    val y = 2

    val penjumlahan = x + y
    println("$x + $y = $penjumlahan")

    val pengurangan = x - y
    println("$x - $y = $pengurangan")

    val perpangkatan = Math.pow(x.toDouble(), y.toDouble())
    println("$x ^ $y = $perpangkatan")

    val pengakaran1 = Math.sqrt(x.toDouble())
    println("akar $x = $pengakaran1")

    val pengakaran2 = Math.sqrt(y.toDouble())
    println("akar $y = $pengakaran2")

    val pembagian = x / y
    println("$x / $y = $pembagian")

    val perkalian = x * y
    println("$x * $y = $perkalian")

}



