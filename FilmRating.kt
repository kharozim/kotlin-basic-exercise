package kotlin_basic_exercise

fun main() {

    print("silahkan masukan umur anda : ")
    val input = readLine()

    if (input != null) {
        val inputint = input.toInt()
        when {
            inputint >= 21 -> println( "Rating film DEWASA bisa kamu tonton ")
            inputint >= 13 -> println( "Rating film REMAJA bisa kamu tonton ")
            inputint >= 9 -> println( "Rating film BIMBINGAN ORANG TUA bisa kamu tonton ")
            inputint < 9 -> println( "Rating film DEWASA bisa kamu tonton ")
            else -> println("Unknown")
        }
    }

}