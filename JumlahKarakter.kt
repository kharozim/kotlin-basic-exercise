package kotlin_basic_exercise

fun main() {
    var kata: String = "Ilmiah"
    var kata2: String = "Lari Pagi"
    val charArray1 = kata.toCharArray()
    val charArray2 = kata2
        .replace("\\s".toRegex(), "") //menghilangkan whitespace
        .toCharArray()

    println(charArray1.indices.endInclusive + 1) //cara 1
    println(charArray1.lastIndex + 1) // cara 2


    println(charArray2.indices.endInclusive + 1)//cara 1
    println(charArray2.lastIndex + 1)// cara 2
}