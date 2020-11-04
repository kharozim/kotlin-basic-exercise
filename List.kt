package kotlin_basic_exercise

fun main() {
    val list = listOf("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis")

    for(kata in list){
        print("${kata.toString()} ")
    }
}