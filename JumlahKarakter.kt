package kotlin_basic_exercise

fun main() {
    var kata : String = "Ilmiah"
    val chararray = kata.toCharArray()
    println(chararray.indices.endInclusive + 1) //cara 1
    println(chararray.lastIndex + 1) // cara 2
}